package com.agibank.exercicios.debug;

public class Main {
    public static void main(String[] args) {
        System.out.println("Average finder v0.1");
        double avg = findAverage(args);
        System.out.println("Average is: " + avg);
    }

    private static double findAverage(String[] input){
        double result = 0;
        for (String s : input){
            result += Integer.parseInt(s);
        }
        return result/ input.length;
    }
}