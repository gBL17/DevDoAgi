package com.agibank.exercicios.ifs.s2.ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        System.out.print("Digite um número: ");
        number = sc.nextInt();

        if(number > 0){
            System.out.println("Número real positivo");
        } else if (number < 0 ) {
            System.out.println("Número real negativo");
        } else {
            System.out.println("Número é Zero");
        }
    }
}
