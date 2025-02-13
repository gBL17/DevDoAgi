package com.agibank.maratonas.s3.treino.matriz;

import java.util.Arrays;

public class Exercicio4 {
    public static void main(String[] args) {
        int[][] matriz = new int[][] {
                {1,2,3},
                {5,6,7},
                {9,10,11},
                {13,14,15}
        };

        int linhas = matriz.length;
        int colunas = matriz[0].length;
        int[][] matrizTransposta = new int[colunas][linhas];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matrizTransposta[j][i] = matriz[i][j];
            }
        }
        System.out.println("Matriz transposta: ");
        System.out.printf(Arrays.deepToString(matrizTransposta));
    }
}
