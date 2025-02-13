package com.agibank.extras.cassino;

import java.util.Arrays;
import java.util.Random;

public class Cassino {
    public int generateNumber(){
        Random ran = new Random();
        return ran.nextInt(0,9);
    }

    public void runSlots(){
        int firstNumber = generateNumber();
        int secondNumber = generateNumber();
        int thirdNumber = generateNumber();
        int[] display = new int[]{firstNumber, secondNumber, thirdNumber};
        System.out.println(Arrays.toString(display));
    }
}
