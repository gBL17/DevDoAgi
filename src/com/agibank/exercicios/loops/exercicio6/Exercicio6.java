package com.agibank.exercicios.loops.exercicio6;

import java.util.Scanner;

public class Exercicio6 {
    public void Exercicio6(Scanner sc) {
        System.out.println("Tem fila amigo?");
        String temFila = sc.nextLine().toUpperCase();
        while (temFila.equals("1") || temFila.equals("SIM") || temFila.equals("S")){
            calculaCliente(sc);
            System.out.println("DESEJA INSERIR UM ITEM?");
            System.out.println("1. SIM(s)");
            System.out.println("2. NÃO(n)");
            temFila = sc.next().toUpperCase();
        }
    }

    public void calculaCliente(Scanner sc){
        double total = 0;
        while (true){
            System.out.println("DESEJA INSERIR UM ITEM?");
            System.out.println("1. SIM(s)");
            System.out.println("2. NÃO(n)");
            String inserir = sc.next().toUpperCase();
            if (inserir.equals("SIM") || inserir.equals("S") || inserir.equals("1")){
                System.out.println("Valor do produto: ");
                total = sc.nextFloat();
            } else break;
        }

        double valorFinal;
        if (total > 300 && total <=500){
            valorFinal = total * 0.95;
            System.out.printf("Valor total: %.2f com desconto de 5%%. \n", total);
            System.out.printf("Valor final = %f \n", valorFinal);
        } else if (total > 500 && total <= 1000) {
            valorFinal = total * 0.9;
            System.out.printf("Valor total: %.2f com desconto de 10%%. \n", total);
            System.out.printf("Valor final = %f \n", valorFinal);
        } else if (total > 1000){
            valorFinal = total * 0.85;
            System.out.printf("Valor total: %.2f com desconto de 15%%. \n", total);
            System.out.printf("Valor final = %f \n", valorFinal);
        } else {
            System.out.printf("Valor final = %f \n", total);
        }
    }
}
