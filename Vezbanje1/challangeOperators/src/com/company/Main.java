package com.company;

public class Main {

    public static void main(String[] args) {
        double firstNumb = 20.00,secondNumb = 80.00;
        double sum= (firstNumb + secondNumb)*100;
        double moduo = sum % 40.00;
        
        boolean wasZero = moduo==0 ? true : false;
        System.out.println(wasZero);
        if(!wasZero){
            System.out.println("got some remainder");
        }
    }
}
