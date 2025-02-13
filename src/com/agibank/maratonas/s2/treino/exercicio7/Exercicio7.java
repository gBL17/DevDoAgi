package com.agibank.maratonas.s2.treino.exercicio7;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        byte mes = 1;
        double aporte;
        do {
            System.out.printf("Digite o gasto no mês %d: ", mes);// informar o mes em que esta
            aporte = sc.nextDouble();
            total += aporte;
            if (total > 5000) { // digitar numero negativo para sair do sistema como no enunciado
                System.out.println("Atenção, gastos ultrapassam 5000,00");
                System.out.printf("Total gasto: %.2f \n", total);
            }
            mes++;
        } while (aporte > 0);
    }
}
