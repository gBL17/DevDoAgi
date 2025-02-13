package com.agibank.maratonas.s2.treino.exercicio2;

import java.util.Scanner;

public class Main {
    // Classe para perguntar e exibir idade do usário pelo console
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short idade;

        System.out.print("Digite sua idade: ");
        idade = sc.nextShort();
        System.out.printf("Você tem %d anos.", idade);
    }
}