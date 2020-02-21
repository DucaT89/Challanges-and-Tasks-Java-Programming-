package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Unesite redni broj meseca");
        int brojMeseca = Integer.parseInt(scan.nextLine());
        if(brojMeseca < 1) System.out.println("GRESKA pri UNOSU");
        else if(brojMeseca == 1) System.out.println("Januar,Zimski mesec");
        else if(brojMeseca == 2) System.out.println("Februar,Zimski mesec");
        else if(brojMeseca == 3) System.out.println("Mart,Prolecni mesec");
        else if(brojMeseca == 4) System.out.println("April,Prolecni mesec");
        else if(brojMeseca == 5) System.out.println("Maj, Prolecni mesec");
        else if(brojMeseca == 6) System.out.println("Jun,Letnji mesec");
        else if(brojMeseca == 7) System.out.println("Jul,Letnji mesec");
        else if(brojMeseca == 8) System.out.println("Avgust,Letnji mesec");
        else if(brojMeseca == 9) System.out.println("Septembar,Jesenji mesec");
        else if(brojMeseca == 10) System.out.println("Oktorbar,Jesenji mesec");
        else if(brojMeseca == 11) System.out.println("Novembar, Jesenji mesec");
        else if(brojMeseca == 12) System.out.println("Decembar, Zimski mesec");
        else System.out.println("GRESKA pri UNOSU");

    }
}
