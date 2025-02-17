package com.agibank.extras.exercism.dart;

class Darts {
    int score(double xOfDart, double yOfDart) {
//        boolean isInInnerCircleRange = (Math.abs(xOfDart) < 0.8 && Math.abs(yOfDart) < 0.8) || (Math.abs(xOfDart) == 0 && Math.abs(yOfDart) <=1) || (Math.abs(xOfDart) <= 1 && Math.abs(yOfDart) ==0);
//        boolean isInMiddleCircleRange = (Math.abs(xOfDart) < 4.8 && Math.abs(yOfDart) < 4.8) || (Math.abs(xOfDart) == 0 && Math.abs(yOfDart) <=5) || (Math.abs(xOfDart) <=5 && Math.abs(yOfDart) == 0);
//        boolean isInOuterCircleRange = (Math.abs(xOfDart) <= 9.8 && Math.abs(yOfDart) <= 9.8 || (Math.abs(xOfDart) == 0 && Math.abs(yOfDart) <= 10) || (Math.abs(xOfDart) <= 10 && Math.abs(yOfDart) == 0));
//
//        if(isInInnerCircleRange) {
//            return 10;
//        } else if (isInMiddleCircleRange){
//            return 5;
//        } else if (isInOuterCircleRange){
//            return 1;
//        } else return 0;
        double radius = Math.sqrt((xOfDart * xOfDart) + (yOfDart * yOfDart));
        if(radius <= 1) {
            return 10;
        } else if (radius <=5){
            return 5;
        } else if (radius <=10){
            return 1;
        } else return 0;

    }
}
