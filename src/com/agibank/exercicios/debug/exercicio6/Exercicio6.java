package com.agibank.exercicios.debug.exercicio6;

public class Exercicio6 {
    public static void exercicio6(){
        int dias = 5;
        double[] precoAcoes = {100,102,101,103,105};

        double retornoMedio = calcularPorcentagem(precoAcoes);
        System.out.println(retornoMedio/(dias-1));
    }

    public static double calcularPorcentagem(double[] vetor){
        double resultado = 0;
        for (int i = 0; i < vetor.length-1; i++) {
            resultado += ((vetor[i+1] - vetor[i]) / vetor[i]) * 100;
        }
        return resultado;
    }
}
