package com.company;

import java.util.Scanner;

public class Additions {
    Scanner scanner = new Scanner(System.in);

    private boolean lettuce;
    private final double priceLettuce = 0.75;

    private boolean tomato ;
    private final double priceTomato = 0.90;

    private boolean carrot;
    private final double priceCarrot = 0.5;

    private boolean onions;
    private final double priceOnions = 0.35;

    public Additions(){
        this.lettuce = false;
        this.tomato = false;
        this.carrot = false;
        this.onions = false;
        selectAddition();
    }
    public void selectAddition(){
        addLettuce();
        addTomato();
        addCarrot();
        addOnions();
    }
    public double extrasPrice(){
        double extras = 0;
        if(isLettuce()){
            extras += priceLettuce;
            System.out.println("Lettuce added for a sum of: "+ priceLettuce+ "\n");
        }
        if(isTomato()){
            extras += priceTomato;
            System.out.println("Tomato added for a sum of: "+ priceTomato+ "\n");
        }
        if(isCarrot()){
            extras += priceCarrot;
            System.out.println("Carrot added for a sum of: "+ priceCarrot+ "\n");
        }
        if(isOnions()){
            extras += priceOnions;
            System.out.println("Onions added for a sum of: "+ priceOnions+ "\n");
        }
        System.out.println("Total sum of extras added "+ extras);
        return extras;
    }





    public boolean isLettuce() {
        return lettuce;
    }

    public void addLettuce() {
        System.out.println("Add Lettuce? For yes enter 1");
        int choice = scanner.nextInt();
        if(choice == 1) {
            this.lettuce = true;
        }else{
            this.lettuce = false;
        }
    }
    public boolean isTomato() {
        return tomato;
    }

    public void addTomato() {
        System.out.println("Add Tomato? For yes enter 1");
        int choice = scanner.nextInt();
        if(choice == 1) {
            this.tomato = true;
        }else{
            this.tomato = false;
        }
    }
    public boolean isCarrot() {
        return carrot;
    }

    public void addCarrot() {
        System.out.println("Add Carrot? For yes enter 1");
        int choice = scanner.nextInt();
        if(choice == 1) {
            this.carrot = true;
        }else{
            this.carrot = false;
        }
    }
    public boolean isOnions() {
        return onions;
    }

    public void addOnions() {
        System.out.println("Add Onions? For yes enter 1");
        int choice = scanner.nextInt();
        if(choice == 1) {
            this.onions = true;
        }else{
            this.onions = false;
        }
    }

    public double getPriceLettuce() {
        return priceLettuce;
    }

    public double getPriceTomato() {
        return priceTomato;
    }

    public double getPriceCarrot() {
        return priceCarrot;
    }

    public double getPriceOnions() {
        return priceOnions;
    }
}
