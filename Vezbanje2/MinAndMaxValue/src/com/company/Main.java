package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int min = 0;
        int max = 0;

        while (true) {
            System.out.println("Enter number");
            int number = Integer.parseInt(scan.nextLine());
        }
    }

    public static void inputThenPrintSumAndAverage (){
        Scanner keyboard = new Scanner(System.in);

        int sum = 0;
        long avg = 0;
        int counter = 0;

        while (true){

            boolean hasNext = keyboard.hasNextInt();

            if(hasNext){

                int input = keyboard.nextInt();
                sum += input;
                counter++;
                avg =  Math.round((double) (sum) / (double) (counter)) ;

            }else {
                System.out.println("SUM = " + sum + " " + "AVG = " + avg);
                break;
            }
            keyboard.nextLine();
        }
        keyboard.close();

    }
}
