package com.agibank.maratonas.s3.treino.vertores;

public class Exercicio6 {
    public static void main(String[] args) {
        int contQueda = 0;
        int contAlta = 0;
        double[] precos = {100,102.5,101,103.5,105,106,108.5,107,109.5,110};

        for (int i = 1; i < precos.length; i++) {
            if (precos[i] > precos[i - 1]) {
                contAlta++;
            } else if (precos[i] < precos[i-1]){
                contQueda++;
            }
        }

        System.out.printf("Dias de alta: %d\nDias de queda: %d", contAlta, contQueda);
    }
}
