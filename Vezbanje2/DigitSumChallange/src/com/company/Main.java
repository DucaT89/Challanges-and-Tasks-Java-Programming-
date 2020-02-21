package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(12345));
    }
    public static int sumDigits(int number){
        int sum = 0;
        if(number >=10) {
            while (number > 0) {
                int lastNumber = number % 10;
                number/=10;
                sum = sum + lastNumber;
            }
            return sum;
        }
        else return -1;
    }
}
