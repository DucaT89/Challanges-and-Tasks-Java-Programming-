package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        Napišite program koji računa nedeljnu platu zaposlenog na bazi unete dnevnice i broja sat. Korisnik
         prvo
        unosi satnicu (npr. 8 dolara), pa onda unosi broj radnih sat radni a te nedelje.
        Treba uzeti u obzir da je
        svaki radni sat posle četrdesetog prekovremeni rad i računa se za 50% više od bazne satnice. Ograničiti
        maksimalan broj radnih sat na 60.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Unesite satnicu: ");
        int satnica = Integer.parseInt(scan.nextLine());
        System.out.println("Unesite broj radnih sati : ");
        int brojRadnihSati = Integer.parseInt(scan.nextLine());
        double suma = 0;
        if (brojRadnihSati > 60)
            System.out.println("Veci broj sati od dozvoljenog");
         else if (brojRadnihSati > 40)
                suma = 40 * satnica + (brojRadnihSati - 40) * (1.5 * satnica);
         else suma = brojRadnihSati * satnica;
         System.out.println("Suma je :" + suma);



    }
    }
