package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Unesite Vase Korisnicko ime");
        String userName = scan.nextLine();
        System.out.println("Unesite vasu numericku sifru");
        int password = Integer.parseInt(scan.nextLine());
        if(userName.equals("Marko") && password ==123)
            System.out.println("Uspesno logovanje");
        else if (userName.equals("Stefan") && password == 321)
            System.out.println("Uspesno logovanje");
        else System.out.println("Pogresan unos, pokusajte ponovo");
    }
}
