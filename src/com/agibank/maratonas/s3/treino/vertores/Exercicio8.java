package com.agibank.maratonas.s3.treino.vertores;

import java.util.Arrays;

public class Exercicio8 {
    public static void main(String[] args) {
        double[] precoCompra = {10000,8000,12000,7000,15000};
        double[] precoVenda = {12000,8500,14000,7200,18000};
        double[] lucro = new double[precoCompra.length];
        double lucroTot = 0;

        for (int i = 0; i < precoCompra.length; i++) {
            lucro[i] = precoVenda[i] - precoCompra[i];
            lucroTot += lucro[i];
        }

        System.out.println(Arrays.toString(lucro));
        System.out.println((lucroTot > 20000) ? (20000 +((lucroTot - 20000) * 0.85)) : lucroTot);
    }
}
