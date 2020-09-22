package com.company;

import java.util.Scanner;

public class Main {

    static List<Integer> list = new List<>();

    public static void main(String[] args) {

        System.out.println("Введите количество ребят.");
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        System.out.println("Введите к.");
        int k=scan.nextInt();
        for(int i=1;i<=N;i++){
            list.add(i);
        }
        list.count(N,k);
    }
}

