package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(12,30));

    }
    public static int getGreatestCommonDivisor(int first,int second){
        int divisor = 0;
        if(first <10 || second< 10){
            return  -1;
        }
        for(int i=1;i <= first;i++){
            if(second % i ==0 && first % i==0){
                divisor = i;
            }
        }
        return divisor;
    }
}
