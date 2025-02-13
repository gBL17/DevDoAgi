package com.agibank.exercicios.execoes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //IO Exception
        try {
            BufferedReader br = new BufferedReader(new FileReader("resumo.txt"));
            System.out.println(br.readLine());
            br.close();
        } catch (IOException e) {
            System.out.println("Erro ao acessar arquivo: " + e.getMessage());
        }
        //SQL Exception
        //Parse Exception - Erro ao converter texto para data
        try{
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date data = sdf.parse("32/01/2023");
        } catch (ParseException e) {
            System.out.println("Data inválida!" + e.getMessage());
        }


        System.out.println("ARQUIVO CONTINUOU RODANDO");
    }
}
