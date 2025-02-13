package com.agibank.maratonas.s3.treino.vertores;

public class Exercicio3 {
    public static void main(String[] args) {
        double[] precos = {98.5, 102, 100.5, 101, 105, 107.5, 110, 100.5, 106, 109.5};
        double maiorPreco = 0;
        double menorPreco = precos[0];

        for (double preco : precos){
            if (preco > maiorPreco){
                maiorPreco = preco;
            }
            if (menorPreco > preco){
                menorPreco = preco;
            }
        }

        System.out.printf("Maior preco = %.2f \nMenor preco = %.2f",maiorPreco,menorPreco);
    }
}
