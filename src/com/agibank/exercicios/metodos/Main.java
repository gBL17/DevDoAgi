package com.agibank.exercicios.metodos;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        metA();
        metB();
    }
    public static void metA(){
        System.out.println("Método A feito -> c('o')ɔ");
    }
    public static void metB() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            System.out.println("Método B feito -> d(*.*)b");
            TimeUnit.MILLISECONDS.sleep(700);
            System.out.println("Método B feito -> d(*.-)b");
            TimeUnit.MILLISECONDS.sleep(700);
            System.out.println("Método B feito -> d(*.*)b");
            TimeUnit.MILLISECONDS.sleep(700);
            System.out.println("Método B feito -> d(-.*)b");
            TimeUnit.MILLISECONDS.sleep(700);
        }
    }
}
