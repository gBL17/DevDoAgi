package com.agibank.maratonas.s3.treino.matriz;

import java.util.Arrays;

public class Execicio3 {
    public static void main(String[] args) {
        int[][] matriz = new int[][] {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        int[] output = new int[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            output[i] = matriz[i][i];
        }

        System.out.println(Arrays.toString(output));
    }
}
