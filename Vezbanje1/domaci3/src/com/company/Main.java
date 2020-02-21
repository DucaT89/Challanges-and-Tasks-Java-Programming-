package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      //  Godina je prestupna godina ada je deljiva sa 4.
       // Ali a o je godina deljiva sa 100, onda je prestupna samo
     //   a o je ta ođe deljiva sa 400.
      //  Napišite program oji proverava da li je godina oju je orisni uneo prestupna.

        Scanner scan = new Scanner(System.in);
        System.out.println("Unesite godinu");
        int godina = Integer.parseInt(scan.nextLine());
        boolean prestupna ;
        int x = godina % 4;
        int v = godina % 400;
        int y =godina % 100;
        System.out.println(x);
        System.out.println(v);
        System.out.println(y);

        if(v==0) prestupna = true;
        else if(y == v && v==0) prestupna = true;
        else if (x==0) prestupna = true;
        else prestupna = false;
        if(prestupna = false) System.out.println("Godina nije prestupna");
        else System.out.println(" Godina je prestupna");
    }
}
