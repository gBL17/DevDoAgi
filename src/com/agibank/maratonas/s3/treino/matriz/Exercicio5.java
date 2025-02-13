package com.agibank.maratonas.s3.treino.matriz;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        int[][] matriz1 = geradorMatriz();
        int[][] matriz2 = geradorMatriz();
        boolean ehPossivel = aMultiplicacaoEhPossivel(matriz1,matriz2);

        if (ehPossivel) {
            int valorComum;
            int[][] matriz3;
            valorComum = verificaValorComum(matriz1, matriz2);
            matriz3=geraMatrizResultante(valorComum, matriz1, matriz2);
            multiplicaMatrizes(matriz3, valorComum, matriz1, matriz2);
            exibeResultado(matriz3);
        } else {
            System.out.println("Multiplicação de matrizes indisponível.");
        }
    }

    private static boolean aMultiplicacaoEhPossivel(int[][] matriz1, int[][] matriz2) {
        return matriz1.length == matriz2[0].length || matriz2.length == matriz1[0].length;
    }

    private static void exibeResultado(int[][] matriz3) {
        System.out.println();
        System.out.println("Matriz calculada!!!");
        System.out.println("Resultado da multiplicação: ");
        for (int[] lines : matriz3){
            System.out.println(Arrays.toString(lines));
        }
    }

    private static int verificaValorComum(int[][] matriz1, int[][] matriz2) {
        int valorComum = (matriz1.length == matriz2[0].length) ? matriz1.length : matriz1[0].length;
        return valorComum;
    }

    private static int[][] geraMatrizResultante(int valorComum, int[][] matriz1, int[][] matriz2) {
        int[][] matriz3;
        if (valorComum == matriz1[0].length) {
            matriz3 = new int[matriz1.length][matriz2[0].length];
            System.out.println("Multiplicando matriz 2 pela matriz 1");
        } else{
            matriz3 = new int[matriz2.length][matriz1[0].length];
            System.out.println("Multiplicando matriz 1 pela matriz 2");
        }
        return matriz3;
    }

    private static void multiplicaMatrizes(int[][] matriz3, int valorComum, int[][] matriz1, int[][] matriz2) {
        for (int i = 0; i < matriz3.length; i++) {
            for (int j = 0; j < matriz3[0].length; j++) {
                for (int k = 0; k < valorComum; k++) {
                    matriz3[i][j] += (valorComum == matriz1.length)
                            ? matriz2[i][k] * matriz1[k][j]
                            : matriz1[i][k] * matriz2[k][j];
                }
            }
        }
    }
    private static int[][] geradorMatriz(){
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Construindo matriz aleatória!");
        System.out.println("Digite número de linhas: ");
        int linhas = sc.nextInt();
        System.out.println("Digite número de Colunas: ");
        int cols = sc.nextInt();
        int[][] matrizAleatoria = new int[linhas][cols];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < cols; j++) {
                matrizAleatoria[i][j] = rand.nextInt(0,10);
            }
        }
        System.out.println("Matriz gerada com sucesso!");
        for (int[] lines : matrizAleatoria){
            System.out.println(Arrays.toString(lines));
        }
        System.out.println();
        return matrizAleatoria;
    }
}
