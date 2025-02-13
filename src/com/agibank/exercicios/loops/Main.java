package com.agibank.exercicios.loops;

import com.agibank.exercicios.loops.exercicio1.Exercicio1;
import com.agibank.exercicios.loops.exercicio2.Exercicio2;
import com.agibank.exercicios.loops.exercicio3.Exercicio3;
import com.agibank.exercicios.loops.exercicio4.Exercicio4;
import com.agibank.exercicios.loops.exercicio5.Exercicio5;
import com.agibank.exercicios.loops.exercicio6.Exercicio6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Exercicio1 ex1 = new Exercicio1();
        Exercicio2 ex2 = new Exercicio2();
        Exercicio3 ex3 = new Exercicio3();
        Exercicio4 ex4 = new Exercicio4();
        Exercicio5 ex5 = new Exercicio5();
        Exercicio6 ex6 = new Exercicio6();
//
//        System.out.println("Taboada do Número: ");
//        ex1.Taboada(sc.nextInt());
//
//        System.out.println("Selecione o número: ");
//        ex2.QuadradoSomandoImpares(sc.nextInt());
//
//        System.out.println("Digite a base e a potência: ");
//        ex3.Exercicio3(sc.nextInt(), sc.nextInt());

        ex4.Exercicio4(sc);
//        ex5.fibonacci(sc);
//        ex6.Exercicio6(sc);
    }
}
