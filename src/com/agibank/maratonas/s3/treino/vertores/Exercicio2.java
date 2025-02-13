package com.agibank.maratonas.s3.treino.vertores;

public class Exercicio2 {
    public static void main(String[] args) {
        double[] precos = {100, 102, 101, 103, 105, 106, 108};
        double[] arrPrecos = new double[3];
        double soma = 0;

        for (int i = precos.length - 1; i > precos.length - 4; i--) {
            int atual = (precos.length - 1) - i;
            arrPrecos[atual] = precos[i];
        }

        for (double preco : arrPrecos){
            soma += preco;
        }
        System.out.printf("Soma total = %.2f\nMédia móvel = %.2f", soma, soma/arrPrecos.length);
    }
}
