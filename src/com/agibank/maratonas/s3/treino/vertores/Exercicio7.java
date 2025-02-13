package com.agibank.maratonas.s3.treino.vertores;

import java.util.Arrays;

public class Exercicio7 {
    public static void main(String[] args) {
        double soma = 0;
        double[] carteira = {5000,3000,7000,4000,6000};
        String[] participacao = new String[carteira.length];
        for (double acao : carteira){
            soma += acao;
        }
        for (int i = 0; i < carteira.length; i++) {
            double porcetagem = carteira[i] / soma * 100;
            participacao[i] = String.format("%.2f%%", porcetagem);
        }
        System.out.printf("Total investido: R$%.2f \n", soma);
        System.out.println(Arrays.toString(participacao));
    }
}
