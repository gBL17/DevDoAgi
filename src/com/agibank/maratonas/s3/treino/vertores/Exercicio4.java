package com.agibank.maratonas.s3.treino.vertores;

import java.util.Arrays;

public class Exercicio4 {


    public static void main(String[] args) {
        double[] precos = {100, 102, 101, 103, 105};
        double[] variacao = new double[precos.length - 1];
        for (int i = 1; i < precos.length; i++) {
            variacao[i-1] = (precos[i] - precos[i-1]) / precos[i-1] * 100;
        }

        System.out.println("Variações diárias: " + Arrays.toString(variacao));
    }
}
