package com.agibank.exercicios.metodos.exercicios;

import java.util.Arrays;

import static com.agibank.exercicios.metodos.exercicios.Correlacao.calcularCorrelacao;
import static com.agibank.exercicios.metodos.exercicios.SimulacaoPrecoMonteCarlo.simularPrecoMonteCarlo;

public class Main {
    public static void main(String[] args) {
//        double[] precos = {100,102,101,103,105};
//        String[] ativo1 = {"Ativo 1", "5%"};
//        String[] ativo2 = {"Ativo 2", "4.5%"};
//        double[] desvios = {0.01,0.02,-0.01,0.03,-0.02};
        double[] serie1 = {100,102,104,106};
        double[] serie2 = {50,51,52,53};
//        System.out.println(converterMoeda(100, 4.9));
//        System.out.println(calcularJurosSimples(1000, 5, 3));
//        System.out.println(calcularCrescimento(100, 105));
//        System.out.println(calcularMediaMovel(precos, 3));
//        System.out.println(compararAtivos(ativo1, ativo2));
//        System.out.println(calcularVolatilidade(desvios));
        System.out.println(calcularCorrelacao(serie1,serie2));
        System.out.println(Arrays.toString(simularPrecoMonteCarlo(100, 0.001, 0.02, 10)));;
    }
    public static String converterMoeda(double valor, double cotacao){
        double valorConvertido = valor / cotacao;
        return String.format("%.2f reais equivalem a %.2f dólares", valor, valorConvertido);
    }

    public static String calcularJurosSimples(double capital, double taxa, int anos){
        taxa /= 100;
        double resultado = capital;
        for (int i = 0; i < anos; i++) {
            resultado+= capital * taxa;
        }
        return String.format("Montante final : %.2f", resultado);
    }

    public static String calcularCrescimento(double inicio, double fim){
        double resultado = (fim - inicio) / fim;
        return String.format("Crescimento: %.2f%%", resultado * 100);
    }

    public static String calcularMediaMovel(double[] precos, int intervalo){
        int index = precos.length - intervalo;
        StringBuilder resposta = new StringBuilder("Média movel: ");
        for (int i = 0; i <= index; i++) {
            double mediaMovel = 0;
            for (int j = i; j < i  + intervalo; j++) {
                mediaMovel += precos[j];
            }
            resposta.append(mediaMovel/intervalo).append(" ");
        }
        return resposta.toString();
    }

    public static String compararAtivos(String[] ativo1, String[] ativo2){
        ativo1[1] = ativo1[1].replace("%", "");
        ativo2[1] = ativo2[1].replace("%", "");
        return (Double.parseDouble(ativo1[1]) > Double.parseDouble(ativo2[1]))
                ? String.format("O ativo com maior retorno é o : %s", ativo1[0])
                : String.format("O ativo com maior retorno é o: %s", ativo2[0]);
    }

    public static String calcularVolatilidade(double[] retornosDiarios){
        double somaTotal = 0;
        double[] desvios = new double[retornosDiarios.length];
        double media = getMedia(retornosDiarios);

        for (int i = 0; i < retornosDiarios.length; i++) {
            desvios[i] = Math.pow(retornosDiarios[i] - media, 2);
        }

        for (double valor : desvios){
            somaTotal+= valor;
        }
        return String.format("Desvio padrão: %.4f", Math.sqrt(somaTotal/ retornosDiarios.length));

    }

    private static double getMedia(double[] array) {
        double somaTotal = 0;
        double media;
        for (double valor : array){
            somaTotal += valor;
        }
        media = somaTotal / array.length;
        return media;
    }
}
