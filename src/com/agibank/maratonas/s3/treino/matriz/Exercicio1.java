package com.agibank.maratonas.s3.treino.matriz;

public class Exercicio1 {
    public static void main(String[] args) {
        int[][] matriz = new int[][] {
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };
        for (int[] ints : matriz) {
            System.out.print("{ ");
            for (int j = 0; j < ints.length; j++) {
                System.out.printf((j < matriz.length - 1) ? "%s, " : "%s }", ints[j]);
            }
            System.out.println();
        }
    }
}
