package com.company;

import java.util.Scanner;

public class HealthyBurger extends Burger {

    Scanner scanner = new Scanner(System.in);
    private boolean guacamole;
    private boolean mushrooms;
    private final double guacamolePrice = 1.25;
    private final double mushroomsPrice = 1.15;
    private double basePriceHelthy =3.35;

    public HealthyBurger(String name, int meatNumber, Additions additions) {
        super(name, meatNumber, additions);
        super.setBreadRoll("Rye");
        addGuacamole();
        addMushrooms();
    }

    @Override
    public double getPrice() {
        double endPrice = 0;
        System.out.println("--------------------------");
        System.out.println(this.getName() + " burger "+this.getBreadRoll()+ " Bread = "+ basePriceHelthy+ " .");
        double additions = this.getAdditions().extrasPrice();
        if(this.getMeatNumber() != 1){
            System.out.println("Meat added");
            endPrice = basePriceHelthy + ((this.getMeatNumber()-1)*this.getMeatPrice()) +additions;
            System.out.println("Total: "+ endPrice + " .");
        }else {
            endPrice = basePriceHelthy + additions;
            System.out.println("Total: "+ endPrice + " .");
        }
        if(isGuacamole()){
            endPrice += guacamolePrice;
            System.out.println("Guacamole added for extra: "+guacamolePrice);
        }
        if(isMushrooms()){
            endPrice += mushroomsPrice;
            System.out.println("Mushrooms added for extra: "+mushroomsPrice);
        }
        System.out.println("Total: "+ endPrice + " .");
        return endPrice;
    }

    public void addGuacamole() {
        System.out.println(" Guacamole? for Yes enter 1");
        int choice = scanner.nextInt();
        if (choice == 1) {
            this.guacamole = true;
        }else{
            this.guacamole = false;
        }
    }

    public void addMushrooms() {
        System.out.println("Mushrooms ? for Yes enter 1");
        int choice = scanner.nextInt();
        if (choice == 1) {
            this.mushrooms = true;
        }else{
            this.mushrooms = false;
        }
    }

    public boolean isGuacamole() {
        return guacamole;
    }

    public boolean isMushrooms() {
        return mushrooms;
    }

    public double getGuacamolePrice() {
        return guacamolePrice;
    }

    public double getMushroomsPrice() {
        return mushroomsPrice;
    }

    public double getBasePriceHelthy() {
        return basePriceHelthy;
    }

}
