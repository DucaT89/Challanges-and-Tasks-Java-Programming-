package com.company;

public class Main {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
            }
        }
    }

    public static boolean isOdd(int number) {
        if (!(number > 0)) {
            return false;
        } else if (number % 2 == 0) {
            return true;
        } else
            return false;
    }

    public static int sumOdd(int start, int end) {
        if ((start > 0 && end > 0) && (start <= end)) {
            int sum = 0;
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum += i;
                }

            }
            return sum;
        } else return -1;
    }

}

