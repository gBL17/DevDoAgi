package com.agibank.exercicios.loops.exercicio2;

import java.util.ArrayList;

public class Exercicio2 {
    public void QuadradoSomandoImpares(int num){
        int imparAtual = 1;
        int total = 0;
        ArrayList<Integer> numerosImpares = new ArrayList<>();
        do {
            total += imparAtual;
            numerosImpares.add(imparAtual);
            imparAtual += 2;
        } while (total < num * num);
        String teste = numerosImpares.toString().replace("[","").replace("]","").replace(","," +");
        System.out.printf("Somando: " + teste + " = %d \n", total);
    }
}
