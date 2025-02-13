package com.agibank.maratonas.s3.treino.vertores;

public class Exercicio1 {
    public static void main(String[] args) {
        double[] precos = {10, 11, 9, 8, 6,3, 5, 6, 7, 10, 1, 1, 6, 7, 8, 9,0, 1, 2};

        for (int i = 2; i < precos.length; i++) {
            if (precos[i-2] < precos[i-1] && precos[i-1] < precos[i]){
                System.out.printf("Tendência de alta!!! \n dia: %d até ", i-1);
                while (i < precos.length-1 && precos[i] < precos[i+1]) i++;
                System.out.printf("%d. \n",i+1);
            }
        }
    }
}