package com.agibank.exercicios.debug.exercicio7;

import java.util.Arrays;

public class Exercicio7 {
    public static void exercicio7(){
        int linhas = 3;
        int colunas = 4;
        double[] riscos = new double[3];
//        new double[linhas][colunas]
        double[][] variacaoAcoes = {
                {1,1.2,1.1,1.3},
                {0.9,1,1.1,1.2},
                {1.5,1.6,1.4,1.3}
        };

        for (int i = 0; i < variacaoAcoes.length; i++) {
            double risco = 0;
            for (int j = 0; j < variacaoAcoes[i].length - 1; j++) {
                risco += Math.abs(variacaoAcoes[i][j + 1] - variacaoAcoes[i][j]);
            }
            riscos[i] = risco;
        }
        System.out.println(Arrays.toString(riscos));
    }
}
