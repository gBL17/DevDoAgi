package com.agibank.maratonas.s3.treino.vertores;

public class Exercicio5 {
    public static void main(String[] args) {
        double[] precos = {100, 102, 101, 103, 105};
        double crescimentoDiario = 0;
        for (int i = 1; i < precos.length ; i++) {
            crescimentoDiario +=(precos[i] - precos[i-1] )/ precos[i-1];
        }
        System.out.printf("Crescimento diário: %.2f%%",crescimentoDiario * 100);
    }
}
