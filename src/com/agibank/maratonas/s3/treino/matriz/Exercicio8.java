package com.agibank.maratonas.s3.treino.matriz;

public class Exercicio8 {
    public static void main(String[] args) {
        int[][] matriz = {
                {1,0,0},
                {0,1,0},
                {0,0,1}
        };
        int soma = 0;

        for (int i = 0; i < matriz.length; i++) {
            soma += matriz[i][i];
        }

        int somaResto =0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                somaResto += (i != j) ? matriz[i][j] : 0;
            }
        }

        if (soma == matriz.length && somaResto == 0) {
            System.out.println("Matriz identidade!!!");
        } else System.out.println("Não foi dessa vez");
    }
}
