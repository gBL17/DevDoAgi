package com.agibank.exercicios.switchState.ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Avalie o atendimento (0 a 5): ");
        switch (sc.nextByte()){
            case 1 -> System.out.println("Serviço ruim");
            case 2 -> System.out.println("Serviço abaixo da média");
            case 3 -> System.out.println("Serviço na média");
            case 4 -> System.out.println("Serviço acima da média");
            case 5 -> System.out.println("Serviço excelente");
            default -> System.out.println("Desculpe, não entendi.");
        }
    }
}