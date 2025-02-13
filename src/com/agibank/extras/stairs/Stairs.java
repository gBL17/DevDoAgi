package com.agibank.extras.stairs;

import java.util.Scanner;

public class Stairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Levels in the stairs: ");
        int levels = sc.nextInt();

        for (int i = 0; i < levels; i++) {
            System.out.print("\n");
            for (int j = 0; j <= i * 2; j++) {
                System.out.print("*");
            }
        }

        for (int i = levels; i > 0; i--) {
            System.out.print("\n");
            for (int j = 0; j <= i * 2;j++){
                System.out.print(" ");
            }
            for (int k = 0; k <= (levels-i) *2; k++ ){
                System.out.print("*");
            }
        }
    }
}
