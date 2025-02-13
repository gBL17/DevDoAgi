package com.agibank.exercicios.debug.exercicio3;

import java.util.Arrays;

public class Exercicio3 {
    public static void exercicio3(){
        double valorEmprestimo = 1000;
        int parcelas = 4;
        double[] prestacoes = new double[parcelas];
        double valorParcela = valorEmprestimo/parcelas;

        Arrays.fill(prestacoes, valorParcela);

        System.out.println(Arrays.toString(prestacoes));
    }
}