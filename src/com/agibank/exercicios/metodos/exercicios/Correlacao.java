package com.agibank.exercicios.metodos.exercicios;

public class Correlacao {
    public static double calculaMediaVetor(double[] vetor){
        double resultado = 0;

        for (double valor: vetor){
            resultado += valor;
        }
        return resultado/ vetor.length;
    }

    public static double calculaDesvioPadrao(double[] vetor){
        double resultado = 0;
        double mediaVetor = calculaMediaVetor(vetor);

        for (double valor : vetor){
            resultado += Math.pow((valor - mediaVetor), 2);
        }
        return Math.sqrt(resultado/(vetor.length-1));
    }


    public static double calcularCorrelacao(double[] vetor1, double[] vetor2){
        double resultado = 0;
        double comprimentosVetoresMenosUm = vetor1.length - 1;
        double mediaVetor1 = calculaMediaVetor(vetor1);
        double mediaVetor2 = calculaMediaVetor(vetor2);
        double desvioPadraoVetor1 = calculaDesvioPadrao(vetor1);
        double desvioPadraoVetor2 = calculaDesvioPadrao(vetor2);

        for (int i = 0; i < vetor1.length; i++) {
            resultado += ((vetor1[i] - mediaVetor1/desvioPadraoVetor1)
                    * ((vetor2[i] - mediaVetor2)/desvioPadraoVetor2) / comprimentosVetoresMenosUm);
        }
        return resultado;
    }
}
