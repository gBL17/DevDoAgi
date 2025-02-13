package com.agibank.exercicios.ifs.s2.ex3;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        float peso;
        float altura;

        System.out.println("Digite o peso: ");
        peso = sc.nextFloat();
        System.out.println("Digite a altura: ");
        altura = sc.nextFloat();

        float IMC = peso / (altura * altura);

        System.out.printf("IMC: %.2f \n", IMC);
        if (IMC < 18.5){
            System.out.println("Categoria: Magreza");
        } else if (IMC < 24.9) {
            System.out.println("Categoria: Peso normal");
        } else if (IMC < 29.9) {
            System.out.println("Categoria: Sobrepeso");
        } else if (IMC < 34.9) {
            System.out.println("Categoria: Obesidade grau I");
        } else if (IMC < 39.9){
            System.out.println("Categoria: Obesidade grau II");
        } else {
            System.out.println("Categoria: Obesidade grave III");
        }
    }
}
