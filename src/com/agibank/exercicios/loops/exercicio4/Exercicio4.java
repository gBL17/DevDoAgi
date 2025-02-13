package com.agibank.exercicios.loops.exercicio4;

import java.util.Scanner;

public class Exercicio4 {
    public void Exercicio4(Scanner sc){
        int resultado = 1;
        System.out.println("Numero fatorial: ");
        int atual = sc.nextInt();
        if (atual > 0) {
            do {
                resultado *= atual;
                atual--;
            } while (atual > 1);
        } else Exercicio4(sc);
        System.out.println(resultado);
    }
}
