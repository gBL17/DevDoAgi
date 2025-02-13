package com.agibank.maratonas.s3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double saldo;
        double pContribuicao;
        double rTaxaAnualDeJuros;
        double nTotalMesesContribuicao;
        double diferetentesCenarios;
        int anosDeContribuicao;
        String[] titulo = {"Taxa", "1º ano"};
        double[][] matriz = {};

        projecaoDiferentesCenarios(30,1000,65);
    }

    public static void projecaoDiferentesCenarios(int idade, double contribuicaoMensal, int idadeFInal){
        int diferencaAnos = (idadeFInal - idade);
        double[] taxasDeJurosSimulados = {0.04/12,0.06/12,0.08/12,0.10/12};
        int i;
        String[][] matriz = new String[taxasDeJurosSimulados.length][diferencaAnos];

        for (int k = 0; k < taxasDeJurosSimulados.length; k++) {
            matriz[k][0] = String.format("%.2f%%", (taxasDeJurosSimulados[k] * 12 * 100));
        }

        for (i = 0; i < taxasDeJurosSimulados.length; i++) {
            System.out.printf("Simulação para %.2f%%\n", taxasDeJurosSimulados[i]);
            for (int j = 1; j < diferencaAnos; j++) {
                double resultado = contribuicaoMensal * (Math.pow((1+taxasDeJurosSimulados[i]),((j)*12))-1) / taxasDeJurosSimulados[i];
                matriz[i][j] = String.format("R$ %.2f", resultado);
            }
        }

        for (String[] lines : matriz){
            System.out.println(Arrays.toString(lines));
        }
    }
}
