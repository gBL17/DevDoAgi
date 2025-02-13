package com.agibank.extras.banking.entities;

import java.util.ArrayList;

public class Cliente {
    long id;
    String nome;
    String cpf;
    ArrayList<Conta> contas = new ArrayList<>();

    public void abrirConta(Conta conta){
        contas.add(conta);
    }

    public void listaContas(){
        for (Conta conta : contas){
            System.out.println(conta);
        }
    }
}
