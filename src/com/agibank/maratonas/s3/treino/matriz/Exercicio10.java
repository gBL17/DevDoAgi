package com.agibank.maratonas.s3.treino.matriz;

import java.util.Arrays;

public class Exercicio10 {
    public static void main(String[] args) {
        int[][] matriz = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int[][] matrizTransposta = new int[matriz[0].length][matriz.length];

        int k = matriz.length - 1;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = matriz.length-1; j >= 0; j--) {
                matrizTransposta[j][k] = matriz[i][j];
            }
            k--;
        }

        for (int[] linhas : matrizTransposta){
            System.out.println(Arrays.toString(linhas));
        }
    }
}
