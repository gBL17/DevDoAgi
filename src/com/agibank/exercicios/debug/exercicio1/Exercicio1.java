package com.agibank.exercicios.debug.exercicio1;

import java.util.Arrays;

public class Exercicio1 {
    public static void exercicio1(){
        double[] precos = {100,102,101,103,105};
        double[] variacaoDiaria = new double[precos.length-1];

        try {
            if (precos.length < 2) throw new IllegalArgumentException("Operação disponível daqui alguns dias");
            for (int i = 1; i < variacaoDiaria.length; i++) {
                variacaoDiaria[i] = ((precos[i] - precos[i-1])/ precos[i-1]) * 100;
            }
            System.out.println(Arrays.toString(variacaoDiaria));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());;
        }
    }
}
