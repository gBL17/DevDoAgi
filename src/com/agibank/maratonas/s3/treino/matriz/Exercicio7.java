package com.agibank.maratonas.s3.treino.matriz;

public class Exercicio7 {
    public static void main(String[] args) {
        int[][] matriz = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int somaDiagonalPrincipal =0;
        int somaDiagonalSecundaria =0;
        System.out.println("Diagonal principal: ");
        for (int i = 0; i < matriz.length; i++) {
            somaDiagonalPrincipal += matriz[i][i];
        }
        for (int i = 0; i < matriz.length; i++) {
            somaDiagonalSecundaria += matriz[i][matriz.length-1-i];
        }

        System.out.println(somaDiagonalPrincipal);
        System.out.println(somaDiagonalSecundaria);
    }
}
