package com.agibank.extras.banking.entities;

import com.agibank.extras.banking.enums.Operacoes;
import com.agibank.extras.banking.enums.TipoDeConta;

import java.util.ArrayList;

public class Conta {
    private long id;
    double saldo;
    private TipoDeConta tipoDeConta;
    private Cliente cliente;
    private Agencia agencia;
    private ArrayList<Transacao> extrato;

    public Conta(long id, double saldo, TipoDeConta tipoDeConta, Cliente cliente, Agencia agencia) {
        this.id = id;
        this.saldo = saldo;
        this.tipoDeConta = tipoDeConta;
        this.cliente = cliente;
        this.agencia = agencia;
        this.extrato = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public double getSaldo() {
        return saldo;
    }

    public TipoDeConta getTipoDeConta() {
        return tipoDeConta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTipoDeConta(TipoDeConta tipoDeConta) {
        this.tipoDeConta = tipoDeConta;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public void saque(double valor, Conta conta){
        Transacao saque = new Transacao(-valor, conta, Operacoes.SAQUE);
        conta.extrato.add(saque);
        conta.saldo-= valor;
        System.out.printf("Valor do saldo atualizado: %.2f", conta.saldo);
    }

    public void deposito(double valor, Conta conta){
        Transacao deposito = new Transacao(valor, conta, Operacoes.DEPOSITO);
        conta.extrato.add(deposito);
        conta.saldo+= valor;
        System.out.printf("Valor do saldo atualizado: %.2f", conta.saldo);
    }

    public void transferencia(double valor, Conta contaSaida, Conta contaEntrada, Operacoes operacao){
        Transacao enviaTransferencia = new Transacao(-valor,contaSaida, operacao);
        Transacao recebeTransferencia = new Transacao(valor,contaEntrada, operacao);
        contaSaida.extrato.add(enviaTransferencia);
        contaEntrada.extrato.add(recebeTransferencia);

        contaSaida.saldo -= valor;
        contaEntrada.saldo += valor;
    }

    public double consultarSaldo(){
        return saldo;
    }

    public void mostraExtrato(Conta conta){
        for (Transacao transacao : conta.extrato){
            System.out.println(transacao);
        }
    }
}
