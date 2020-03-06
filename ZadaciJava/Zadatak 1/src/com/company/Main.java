package com.company;
//Zadatak za proveru znanja   Napisati aplikaciju za sportski savez na programskom jeziku java.
//U paketu osoblje postoji Osoba. Osoba ima ime i prezime.
//U paketu osoblje postoji Zaposleni. Zaposleni je Osoba i realizuje sledeće metode:
//• LocalDate getDatumPotpisivanja() •
// LocalDate getDatumIstekaUgovora()
// • void potpisiUgovor(LocalDate datumIstekaUgovora).
//
//U paketu osoblje postoji Igrac. Igrac je Zaposleni koji ima poziciju.
// • Ispisuje se u formatu:   Ime i prezime – Igrac (pozicija)
//U paketu osoblje postoji Trener. Trener je Zaposleni koji ima zaduzenje.
// • Ispisuje se u formatu:   Ime i prezime - Trener (zaduzenje)
//U paketu osoblje postoji Menadzer koji je Zaposleni.   •  Ispisuje se u formatu:
// Ime i prezime - Menadzer
//U paketu savez postoji Tim. Tim ima naziv, listu igrača, listu trenera,
// jednog menadžera i datum osnivanja. Liste igraca i trenera se stvaraju prazne.
// Igrac, trener i menadžer se kasnije mogu dodati u tim i pritom takođe potpisuju ugovor.
// • Ispisuje se u formatu:   Tim - Naziv tima (dan.mesec.godina osnivanja)   - Menadzer - Igrac1                 - Igrac2                        - Trener1  - Trener2  ... (Igrače i trenere sortirati po pozicijama/zaduzenjima pre ispisa)
//
//U paketu savez postoji SportskoDrustvo. SportskoDrustvo ima naziv,
// adresu i listu timova. Lista timova se stvara prazna, a timovi se kasnije dodaju jedan po jedan.
// • Može se vratiti ukupan broj igrača u sportskom društvu.   •
// Može se vratiti ukupan broj trenera u sportskom društvu. •
// Može se vratiti ukupan broj menadžera u sportskom društvu.


import osoblje.Igrac;
import osoblje.Menadzer;
import osoblje.Trener;
import savez.SportskoDrustvo;
import savez.Tim;

import java.time.LocalDate;

public class Main {


    public static void main(String[] args) {
        SportskoDrustvo zvezda = new SportskoDrustvo("FK Crvena Zvezda", "Ljutice Bogdana 1");

        Tim seniori = new Tim("FK Crvena Zvezda", LocalDate.of(1993,4,21));
        Tim omladinci = new Tim("OFK Crvena Zvezda", LocalDate.of(1996,3,11));

        Igrac strale = new Igrac("Stevan","Stevanovic","Napad");
        Igrac dule = new Igrac("Marko","Markovic","Odbrana");
        Igrac steva = new Igrac("Jovan","Jovanovic","Napad");
        Menadzer goran = new Menadzer("Nenad","Nenadic");

        seniori.potpisiUgovor(strale, LocalDate.of(2020,5,5));
        seniori.potpisiUgovor(dule, LocalDate.of(2020,5,5));
        seniori.potpisiUgovor(steva, LocalDate.of(2020,5,5));
        seniori.potpisiUgovor(goran, LocalDate.of(2020,5,5));

        Trener sale = new Trener("Mitar", "Mitrovic","Motivacioni trener");
        Trener pavle = new Trener("Pavle", "Pavlovic","Kondicionalni trener");
        Igrac luka = new Igrac("Luka","Lukic","Odbrana");
        Igrac djole = new Igrac("Djordje","Djordjevic","Golman");
        Igrac zaric = new Igrac("Zarko","Zaric","Napad");
        Menadzer miodrag = new Menadzer("Mihailo","Mihailovic");

        omladinci.potpisiUgovor(pavle, LocalDate.of(2020,5,5));
        omladinci.potpisiUgovor(sale, LocalDate.of(2020,5,5));
        omladinci.potpisiUgovor(luka, LocalDate.of(2020,5,5));
        omladinci.potpisiUgovor(djole, LocalDate.of(2020,5,5));
        omladinci.potpisiUgovor(zaric, LocalDate.of(2020,5,5));
        omladinci.potpisiUgovor(miodrag, LocalDate.of(2020,5,5));

        zvezda.dodajTim(seniori);
        zvezda.dodajTim(omladinci);

        System.out.println(zvezda);
    }

    }

