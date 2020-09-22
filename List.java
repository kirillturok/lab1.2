package com.company;

public class List<K> {

    private int size = 0;
    private Node<K> head = null;

    private class Node<K> {
        K data;
        Node<K> next;

        public Node(K data, Node<K> next) {
            this.data = data;
            this.next = next;
        }
    }


    public int size() {
        return size;
    }


    public void add(K elem) {
        if (size() == 0) {
            head = new Node<>(elem, null);
        } else {
            int i;
            Node<K> trav;
            for (i = 0, trav = head; i < size-1; i++)
                trav = trav.next;
            trav.next = new Node<>(elem, head);
        }
        size++;
    }



    public K get(int index) {
        int i;
        Node<K> temp;
        for (i = 0, temp = head; i != index; i++)
            temp = temp.next;

        return temp.data;
    }


    public void set(int index, K data) {
        int i;
        Node<K> temp;
        for (i = 0, temp = head; i != index; i++)
            temp = temp.next;

        temp.data = data;
    }


    public boolean remove(int index) {
        if (index>size-1){return false;}




        if (index==0) {
            head = head.next;
            --size;
            if (size() == 0) {head = null;}
            return true;

        }
        if (index==size-1) {
            int i;
            Node<K> trav;
            for (i = 0, trav = head; i < index; i++)
                trav = trav.next;
            trav.next = null;
            size--;
            if (size() == 0) head = null;
            return true;
        }

        int i;
        Node<K> trav;
        for (i = 1, trav = head; i < index; i++)
            trav = trav.next;
            trav.next=trav.next.next;
            trav.next.next=null;
            --size;
        return true;
    }

    public void count(int N, int k){
        Node<K> temp=head;
        print();
        for (int i=1;i<N;i++){
            for (int j=1;j<k-1;j++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            size--;
            temp=temp.next;
            print();
        }
    }

    public void print(){
        int i;
        Node<K> temp;
        for (i=0, temp=head;i<size;i++){
            System.out.printf("%d\t", temp.data);
            temp = temp.next;
        }
        System.out.println();
    }


}
