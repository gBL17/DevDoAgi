package com.agibank.exercicios.switchState.ex1;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        fazerInvestimento(sc);
    }

    private static void fazerInvestimento(Scanner sc) {
        String[] investimentos = new String[]{"CDB","CDI", "TESOURO DIRETO", "FIL"};
        System.out.println(Arrays.toString(investimentos));
        System.out.println("Escreva o investimento desejado: ");

        switch (sc.nextLine().toUpperCase()){
            case "CDB":
                System.out.println("Investimento selecionado: CDB");
                break;
            case "CDI":
                System.out.println("Investimento selecionado: CDI");
                break;
            case "TESOURO DIRETO":
                System.out.println("Investimento selecionado: Tesouro Direto");
                break;
            case "FIL":
                System.out.println("Investimento selecionado: FIL");
                break;
            default:
                System.out.println("Investimento indisponível");
                fazerInvestimento(sc);
                break;
        }
    }
}