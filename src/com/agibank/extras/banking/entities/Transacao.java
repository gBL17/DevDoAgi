package com.agibank.extras.banking.entities;

import com.agibank.extras.banking.enums.Operacoes;

public class Transacao {
    private double valor;
    private Conta conta;
    private Operacoes operacao;

    public Transacao(double valor,Conta conta, Operacoes operacao) {
        this.conta = conta;
        this.valor = valor;
        this.operacao = operacao;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Operacoes getOperacao() {
        return operacao;
    }

    public void setOperacao(Operacoes operacao) {
        this.operacao = operacao;
    }
}
