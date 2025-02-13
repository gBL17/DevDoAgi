package com.agibank.maratonas.s3.treino.matriz;

import java.util.Arrays;

public class Exercicio9 {
    public static void main(String[] args) {
        int[][] matriz = {
                {2,4,6},
                {8,10,12}
        };
        int maiorValor = 0;

        double[][] matrizNormalizada = new double[matriz.length][matriz[0].length];

        for (int[] linhas : matriz){
            for (int valor : linhas){
                maiorValor = (valor > maiorValor) ? valor : maiorValor;
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matrizNormalizada[i][j] = (double) matriz[i][j] /maiorValor;
            }
        }
        System.out.println(Arrays.deepToString(matrizNormalizada));
    }
}
