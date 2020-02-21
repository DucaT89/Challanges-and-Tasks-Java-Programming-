package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public class SharedDigit {
        public static boolean hasSharedDigit(int number1, int number2) {
            if (number1 < 10 || number1 > 99) return false;
            if (number2 < 10 || number2 > 99) return false;

            //NUM 1
            int n11, n12;
            n11 = number1 % 10;
            n12 = (number1 - n11) / 10;

            //NUM 2
            int n21, n22;
            n21 = number2 % 10;
            n22 = (number2 - n21) / 10;

            return (n11 == n21 || n11 == n22 || n12 == n21 || n12 == n22);
        }
    }
}
