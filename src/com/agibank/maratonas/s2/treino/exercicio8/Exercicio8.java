package com.agibank.maratonas.s2.treino.exercicio8;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Total da Dívida: ");
        double totalDivida = sc.nextDouble();
        while (totalDivida < 0 ){
            System.out.println("Divida negativa?");
            totalDivida = sc.nextDouble();
        }
        double valorEconomizado = 0;
        int mes = 1;
        do {
            System.out.printf("Valor a ser pago nesse mês %d: ", mes);// informar o mes
            double aporteMensal = sc.nextDouble();// impedir pagamento negativo
            while (aporteMensal < 0){
                System.out.println("impossivel aporte negativo");
                aporteMensal = sc.nextDouble();
            }
            totalDivida -= aporteMensal;// +=
            if (totalDivida < 0) {
                valorEconomizado = Math.abs(totalDivida);
                totalDivida = 0;
            }
            System.out.printf("Saldo da dívida atualizado. \n Valor atual: %.2f \n", totalDivida);
        } while (totalDivida > 0);

        if (valorEconomizado > 0) {
            System.out.printf("Dívida paga com sucesso!!! \n Você possui um saldo economizado de: %.2f", valorEconomizado);
        } else {
            System.out.println("Divida paga com sucesso!!!");
        }
    }
}
