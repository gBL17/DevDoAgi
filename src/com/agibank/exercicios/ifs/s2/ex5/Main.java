package com.agibank.exercicios.ifs.s2.ex5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float nota;

        System.out.println("Nota do aluno: ");
        nota = sc.nextFloat();

        if (nota >= 6) {
            System.out.println("Exame");
        } else if (nota >= 4 && nota < 6) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}
