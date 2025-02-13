// dev: Gabriel Rodrigues    tester: Rodrigo Nogueira
// nota: 100
package com.agibank.maratonas.s2;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double gravidade = 9.8;
        double tempo = 0.00;
        double velocidade;
        double angulacaoEmRadianus;
        double x;
        double y;
        double maxY = 0;

        do {
            System.out.println("Velocidade do projétil (m/s): ");
            velocidade = sc.nextDouble();
        } while (velocidade < 0);

        do {
            System.out.println("Angulo em graus amigão (0º a 90º): ");
            angulacaoEmRadianus = Math.toRadians(sc.nextDouble());

        } while (angulacaoEmRadianus < 0 || angulacaoEmRadianus > 90);

        do {
            tempo += 0.01;
            x = velocidade * Math.cos(angulacaoEmRadianus) * tempo;
            y = (velocidade * Math.sin(angulacaoEmRadianus) * tempo) - (0.5 * gravidade * (tempo * tempo));
            maxY = Math.max(y, maxY);
            System.out.printf("Para tempo: %.2f [x= %.2f :y= %.2f] \n", tempo ,x, y);
        } while (y > 0);
        System.out.printf("Belo arremesso!!! \n Valor final de x: %.2f \n Valor máximo de y: %.2f", x, maxY);
    }
}
