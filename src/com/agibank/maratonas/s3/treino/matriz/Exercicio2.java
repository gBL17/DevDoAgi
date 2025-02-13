package com.agibank.maratonas.s3.treino.matriz;

public class Exercicio2 {
    public static void main(String[] args) {
        int somaTotal =0;
        int somaTotalLinhas=0;
        int somaTotalColunas=0;
        int[][] matriz = new int[][] {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        for (int[] ints : matriz) {
            for (int anInt : ints) {
                somaTotal += anInt;
            }
        }
        System.out.printf("Soma total: %d\n",somaTotal);

        for(int[] ints : matriz){
            int somaLinha = 0;
            for (int anInt : ints){
                somaLinha += anInt;
            }
            somaTotalLinhas += somaLinha;
            System.out.printf("Soma linha: %d\n", somaLinha);
        }

        for (int i = 0; i < matriz.length; i++) {
            int somaColunas =0;
            for (int j = 0; j < matriz[i].length; j++) {
                somaColunas+= matriz[j][i];
            }
            somaTotalColunas +=somaColunas;
            System.out.printf("Soma colunas: %d\n", somaColunas);
        }

        System.out.println(somaTotalLinhas);
        System.out.println(somaTotalColunas);
    }
}
