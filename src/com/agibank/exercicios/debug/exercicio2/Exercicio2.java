package com.agibank.exercicios.debug.exercicio2;

public class Exercicio2 {
    public static void exercicio2(){
        double[] gastosMensais = {1200,1350,1100,1250,1400,1300,1250,1400,1500,1600,1550,1650};
        double media = media(gastosMensais);
        int cont = 0;
        System.out.println("Média de gastos " + media);

        for (double gastoNoMes : gastosMensais){
            if (gastoNoMes > media) cont++;
        }
        System.out.println("Meses acima da média: " + cont);
    }

    public static double media(double[] vetor){
        double resultado = 0;
        for (double valor : vetor){
            resultado += valor;
        }
        return resultado / vetor.length;
    }
}
