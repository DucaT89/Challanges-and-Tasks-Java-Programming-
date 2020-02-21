package com.company;

public class Main {

    public static void main(String[] args) {
	numberToWords(100000);
    }
    public static void numberToWords(int number){
        int numberReversed = reverse(number);
        if(number <0){
            System.out.println("Invalid Value");
        }
        for (int i = 1; i <= getDigitCount(number); i++) {
            int digit = numberReversed % 10;
            numberReversed /= 10;
        switch(digit){
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");break;
            case 5:
                System.out.println("Five");break;
            case 6:
                System.out.println("Six");break;
            case 7:
                System.out.println("Seven");break;
            case 8:
                System.out.println("Eight");break;
            case 9:
                System.out.println("Nine");break;
            default:
                System.out.println("Invalid Value");
        }

        }
    }
    public static int reverse(int number){

        int reverse = 0;
        int digit = 0;
        for(int i = number;number !=0;number /=10){
            digit=number% 10;
            reverse*=10;
            reverse+=digit;
        }
        return reverse;
    }
    public static int getDigitCount(int number){
        int count = 0;
        if (number < 0){
            return - 1;
        }
        else if (number == 0){
            count ++;
        }
        while(number > 0){
            number /=10;
            count++;
        }
        return count;
    }
}
