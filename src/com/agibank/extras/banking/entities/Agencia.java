package com.agibank.extras.banking.entities;

import java.util.ArrayList;

public class Agencia {
    long id;
    String endereco;
    ArrayList<Conta> contas;

    public Agencia(long id, String endereco, ArrayList<Conta> contas) {
        this.id = id;
        this.endereco = endereco;
        this.contas = contas;
    }

    public Agencia(long id, String endereco) {
        this.id = id;
        this.endereco = endereco;
        this.contas = new ArrayList<>();
    }

    public void abrirConta(Conta conta){
        contas.add(conta);
        System.out.println("Conta cadastrada com sucesso");
    }

    public void listarContas(){
        for(Conta conta : contas) {
            System.out.println(conta);
        }
    }
}
