package com.agibank.exercicios.debug;

import static com.agibank.exercicios.debug.exercicio1.Exercicio1.exercicio1;
import static com.agibank.exercicios.debug.exercicio2.Exercicio2.exercicio2;
import static com.agibank.exercicios.debug.exercicio3.Exercicio3.exercicio3;
import static com.agibank.exercicios.debug.exercicio4.Exercicio4.exercicio4;
import static com.agibank.exercicios.debug.exercicio5.Exercicio5.exercicio5;
import static com.agibank.exercicios.debug.exercicio6.Exercicio6.exercicio6;
import static com.agibank.exercicios.debug.exercicio7.Exercicio7.exercicio7;
import static com.agibank.exercicios.debug.exercicio8.Exercicio8.exercicio8;

public class Main {
    public static void main(String[] args) {
        System.out.println("Average finder v0.1");
        double avg = findAverage(args);
        System.out.println("Average is: " + avg);

        exercicio1();
        exercicio2();
        exercicio3();
        exercicio4();
        exercicio5();
        exercicio6();
        exercicio7();
        exercicio8();
    }

    private static double findAverage(String[] input){
        double result = 0;
        for (String s : input){
            result += Integer.parseInt(s);
        }
        return result/ input.length;
    }
}