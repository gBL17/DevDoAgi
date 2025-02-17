package com.agibank.exercicios.debug.exercicio8;

import java.util.Arrays;

public class Exercicio8 {
    public static void exercicio8(){
        double saldoDevedor = 30000;
        int parcelas = 12;
        double taxaDeJuros = 0.015;
        double parcelaFixa = (saldoDevedor * taxaDeJuros) / (1- Math.pow(1+taxaDeJuros, -parcelas));
        double[][] resultado = new double[parcelas][5];

        for (int i = 0; i < parcelas; i++) {
            double valorJuros = saldoDevedor * taxaDeJuros;
            double amortizacao = parcelaFixa - valorJuros;
            resultado[i][0] = saldoDevedor;
            resultado[i][1] = parcelaFixa;
            resultado[i][2] = valorJuros;
            resultado[i][3] = amortizacao;
            saldoDevedor -= amortizacao;
            resultado[i][4] = saldoDevedor;
        }

        for (double[] vetorParcela : resultado){
            System.out.println(Arrays.toString(vetorParcela));
        }
    }
}
