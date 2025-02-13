package com.agibank.maratonas.s3.treino.vertores;

import java.util.Arrays;

public class Exercicio9 {
    public static void main(String[] args) {
        double investimentoInicial = 1000;
        double juros = 0.02;
        int qntdMeses = 6;
        double valorFuturo = investimentoInicial;
        String[] valoresFuturos = new String[qntdMeses];

        for (int i = 0; i < valoresFuturos.length; i++){
            valorFuturo *=(1+juros);
            valoresFuturos[i] = String.format("%.2f%%",valorFuturo);
        }
        System.out.println(Arrays.toString(valoresFuturos));
    }
}
