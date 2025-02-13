package com.agibank.exercicios.ifs.s2.ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        System.out.print("Digite um número: ");
        number = sc.nextInt();

        System.out.println((number % 2 == 0) ? "Par" : "Ímpar");
    }
}
