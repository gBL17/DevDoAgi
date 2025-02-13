package com.agibank.exercicios.loops.exercicio3;

public class Exercicio3 {
    public void Exercicio3(int base, int potencia){
        int resultado = 1;
        for (int i = 0; i < potencia; i++) {
            resultado *= base;
        }
        System.out.printf("%d^%d= %d", base, potencia,resultado);
    }
}
