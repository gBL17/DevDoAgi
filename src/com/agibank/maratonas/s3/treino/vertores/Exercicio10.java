package com.agibank.maratonas.s3.treino.vertores;

public class Exercicio10 {
    public static void main(String[] args) {
        double[] precos = {100,105,102,110,100,107,95,97,99,103};
        double precoMax = 0;
        double precoMaiorQueda = 0;
        double drawdownMax = 0;
        for (int i = 0; i < precos.length; i++) {
            if (precos[i] > precoMax) {
                precoMax = precos[i];
            }
            double drawdown = (precos[i] - precoMax) / precoMax * 100;
            if (drawdown < drawdownMax) {
                drawdownMax = drawdown;
                precoMaiorQueda = precos[i];
            }
        }
        System.out.printf("A maior queda ocorreu do pico de %.2f para %.2f\nDrawdon de %.2f",precoMax,precoMaiorQueda, drawdownMax);
    }
}
