package com.agibank.exercicios.debug.exercicio4;

public class Exercicio4 {
    public static void exercicio4(){
        double[][] contaClientes = {
                {100. -50, 200,-30,50},
                {-100,-200,50,100,150},
                {300,-100,-50,-150,200}
        };

        try{
            if (contaClientes.length < 3) throw new IllegalArgumentException("Número de contas inválido");
            for (double[] extrato : contaClientes){
                double saldoFinal = 1000;
                for (double transacao : extrato){
                    saldoFinal -= transacao;
                }
                System.out.println(saldoFinal);
            }
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }
}
