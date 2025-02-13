package com.agibank.exercicios.loops.exercicio5;

import java.util.Scanner;

public class Exercicio5 {
    int valor1 = 0;
    int novoValor = 1;
    int valorFinal;
    public void fibonacci(Scanner sc){
        System.out.println("Digite o valor a ser encontrado: ");
        valorFinal = sc.nextInt();

        do {
            int atual = novoValor;
            novoValor += valor1;
            valor1 = atual;
        } while (novoValor < valorFinal);

        System.out.println(novoValor);
    }
}
