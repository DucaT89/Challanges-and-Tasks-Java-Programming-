package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(isPalindrome(-222));

    }
    public static boolean isPalindrome(int number){
        int reverse = 0;
        int originalNumber = number;
        int lastDigit = 0;
        while (number != 0){
           lastDigit = number % 10;
           number/=10;
           reverse*=10;
           reverse+=lastDigit;
        }
        if(reverse == originalNumber) return true;
        else
            return false;
    }

    public static boolean hasSameLastDigit(int n1,int n2,int n3){
        if((!isValid(n1)) || (!isValid(n2)) || (!isValid(n3))){
            return false;
        }
        if(n1 % 10 ==n2 %10 || n2%10 == n3%10 || n1%10 ==n3% 10)
            return true;
        else return false;
    }
    public static boolean isValid(int number){
        if(number <10 || number >1000)
            return false;
        else return true;
    }
}
