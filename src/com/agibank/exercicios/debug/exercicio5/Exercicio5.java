package com.agibank.exercicios.debug.exercicio5;

import java.util.Arrays;

public class Exercicio5 {
    public static void exercicio5(){
        double[] gastosSemana = {25,100,500,23,46,101,55};
        double[] precoEmDolar = new double[gastosSemana.length];
        double taxaDeCambio = 5.60;

        for (int i = 0; i < gastosSemana.length; i++) {
            precoEmDolar[i] = converteRealParaDolar(gastosSemana[i], taxaDeCambio);
        }

        System.out.println(Arrays.toString(precoEmDolar));
    }

    public static double converteRealParaDolar(double gasto, double cambio){
        return gasto/cambio;
    }
}
