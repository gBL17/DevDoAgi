package com.agibank.exercicios.metodos.exercicios;

import java.util.Random;

public class SimulacaoPrecoMonteCarlo {
    public static double[] simularPrecoMonteCarlo(
            double precoInicial,
            double mediaRetornoDiario,
            double volatilidadeDiaria,
            int periodos){
        Random ran = new Random();

        double[] resultado = new double[periodos];
        resultado[0] = precoInicial;

        for (int i = 1; i < resultado.length; i++) {
            double expoente = (mediaRetornoDiario + volatilidadeDiaria);
            double z = ran.nextGaussian();

            resultado[i] = resultado[i-1] * Math.pow(Math.E,(expoente*z));
        }

        return resultado;
    }
}
