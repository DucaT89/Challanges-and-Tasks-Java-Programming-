package com.company;

public class CentToInch {

    public static double calcFeetAndInchesToCentimeters(double feet,double inches){

        if( feet < 0 || (inches <0 || inches >12)) {
            return -1;
        }
        double centimeters = feet* 12 * 2.54;
        centimeters += inches *2.54;
        return centimeters;
    }
    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches <0){
            return -1;
        }
        double feet = (int) inches /12;
        int remainingInches = (int) inches % 12;
        return calcFeetAndInchesToCentimeters(feet,remainingInches);
    }
}
