package com.agibank.exercicios.ifs.s2.ex4;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        float valor, media, diferenca, calculaPorcentagem;

        System.out.println("Valor a ser análisado: ");
        valor = sc.nextFloat();
        System.out.println("Valor médio: ");
        media = sc.nextFloat();

        diferenca = valor - media;
        calculaPorcentagem = Math.abs(diferenca / media * 100);

        System.out.printf("%.2f%%", calculaPorcentagem);
    }
}
