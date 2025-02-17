// Nota: 100 - 0 = 100
// Nome do Dev: Gabriel de Freitas Gouvêa Rodrigues
// Tester: Rodrigo Secco Dias Nogueira

package com.agibank.maratonas.s4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Carteira em Hardcode
        //Carteira tratada como string para carregar o titulo do ativo como id (opcional)
        String[][] carteira = {
            { "PETR4" , "22.5" , "23.5" , "22.0" , "24.5" , "25.0"},
            { "VALE3" , "85.0" , "86.5" , "84.0" , "83.5" , "87.0"},
            { "ITUB4" , "30.0" , "29.5" , "30.5" , "31.0" , "32.5"}
        };

        for (String[] ativo : carteira){
            System.out.println(Arrays.toString(ativo));
        }

        //Tratamento exigido verifica se a carteira está vazia
        try{
            if (carteira.length < 1) throw new IllegalArgumentException("Carteira vazia :(");
            System.out.println("Exercicio 1: ");
            System.out.printf("Posição do ativo na carteira para cálcula da média (de 1 até %d): ", carteira.length);
            int posicacao = sc.nextInt();
            System.out.println(media(carteira[posicacao - 1]) + "\n");

            System.out.println("Exercicio 2: ");
            System.out.println(maiorValorizacao(carteira) + "\n") ;

            System.out.println("Exercicio 3: ");
            System.out.println(Arrays.toString(situacaoAtualDoAtivo(carteira)) + "\n");

            System.out.println("Exercicio 4: ");
            System.out.printf("Posição do ativo na carteira (de 1 até %d): ", carteira.length);
            posicacao = sc.nextInt();
            System.out.printf("Dia a ser avaliado (de 1 até %d): \n", carteira[0].length-1);
            int dia = sc.nextInt();
            System.out.println(consultarPrecoDoAtivo(carteira,posicacao,dia) + "\n");
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    //Exercicio 1
    //Calculo da média
    public static String media(String[] ativoNaCarteira){
        double resultado = 0;
        for (int i = 1; i < ativoNaCarteira.length; i++) {
            resultado += Double.parseDouble(ativoNaCarteira[i]);
        }
        resultado  /= ativoNaCarteira.length-1;
        return String.format("Media do ativo %s -> %.2f", ativoNaCarteira[0],resultado);
    }


    //Cálculo da valorização individual de uma ativo
    public static double valorizacao(String[] ativoNaCarteira){
        double valorFinalDoAtivo = Double.parseDouble(ativoNaCarteira[ativoNaCarteira.length - 1]);
        double valorInicialDoAtivo = Double.parseDouble(ativoNaCarteira[1]);
        return (valorFinalDoAtivo - valorInicialDoAtivo) / valorInicialDoAtivo * 100;
    }

    //Exercicio 2
    //Cálculo da maior valorização
    public static String maiorValorizacao(String[][] carteira){
        String[] resultado = carteira[0];
        double maiorValorizacao = 0;

        for (String[] ativo : carteira) {
            double valorizacao = valorizacao(ativo);
            if (valorizacao > maiorValorizacao) {
                maiorValorizacao = valorizacao;
                resultado = ativo;
            }
        }
        String nomeDoAtivoDeMaiorValorizacao = resultado[0];
        String valorInicialDoAtivoDeMaiorValorizacao = resultado[1];
        String valorFinalDoAtivoDeMaiorValorizao = resultado[resultado.length - 1];

        return String.format("Ativo com amior valorização -> %S (de %S para %S), crescimento de %.2f%%",
                nomeDoAtivoDeMaiorValorizacao,
                valorInicialDoAtivoDeMaiorValorizacao,
                valorFinalDoAtivoDeMaiorValorizao,
                maiorValorizacao
        );
    }

    //Metodo auxiliar par ao exercício 3
    private static String geraSituacaoDoAtivo(String[][] carteira, double valortizacao, int i) {
        //if ternário para diminuir o código (condição) ? true : false
        return (valortizacao > 0)
                ? String.format("Ativo: %s Lucro de %.2f%% (de %s para %s )", carteira[i][0], valortizacao, carteira[i][1], carteira[i][carteira[i].length - 1])
                : String.format("Ativo: %s Prejuízo de %.2f%% (de %s para %s)", carteira[i][0], valortizacao, carteira[i][1], carteira[i][carteira[i].length - 1]);
    }

    //Exercicio 3
    //Calcula a situação do ativo e mostra prejuízo ou lucro
    //Gerando um vetor informando a situação de cada ativo
    public static String[] situacaoAtualDoAtivo(String[][] carteira){
        String [] resultado = new String[carteira.length];
        for (int i = 0; i < carteira.length; i++) {
            double valortizacao = valorizacao(carteira[i]);
            resultado[i] = geraSituacaoDoAtivo(carteira, valortizacao, i);
        }
        return resultado;
    }

    //Exercicio4
    //Consulta o preco de um ativo no dia especificado
    public static String consultarPrecoDoAtivo(String[][] carteira, int posicaoDoAtivo, int dia){
        int posicaoParaIndex = posicaoDoAtivo - 1;

        String nomeDoAtivo = carteira[posicaoParaIndex][0];
        String valorDoAtivo = carteira[posicaoParaIndex][dia];
        return String.format("Consulta de preço do ativo %s no dia %s -> %s", nomeDoAtivo,dia, valorDoAtivo);
    }
}
