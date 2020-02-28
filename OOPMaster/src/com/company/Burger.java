package com.company;

public class Burger {

    private String name;
    private String breadRoll;
    private int meatNumber;
    private Additions additions;

    private double meatPrice = 2.15;
    private double basePrice = 2.5;


    public Burger(String name, int meatNumber, Additions additions) {
        this.name = name;
        this.breadRoll = "White Bun";
        if(meatNumber > 1 && meatNumber <=4){
            this.meatNumber = meatNumber;
        }else {
            this.meatNumber = 1;
        }
        this.additions = additions;
    }
    public Burger(){
        this.name = "Clasic";
        this.breadRoll = "White Bun";
        this.meatNumber = 1;
    }



    public double getPrice(){
        double endPrice = 0;
        System.out.println("--------------------------");
        System.out.println(this.getName() + " burger with "+ this.breadRoll+ " Bread = "+ basePrice+ " .");
        double additions = this.getAdditions().extrasPrice();
        if(meatNumber != 1){
            System.out.println("Meat added");
            endPrice = basePrice + ((this.getMeatNumber()-1)*meatPrice) +additions;
            System.out.println("Total: "+ endPrice + " .");
            return endPrice;
        }else {
            endPrice = basePrice + additions;
            System.out.println("Total: "+ endPrice + " .");
            return endPrice;
        }

    }

    public String getName() {
        return name;
    }

    public int getMeatNumber() {
        return meatNumber;
    }

    public double getMeatPrice() {
        return meatPrice;
    }

    public Additions getAdditions() {
        return additions;
    }

    public void setBreadRoll(String breadRoll) {
        this.breadRoll = breadRoll;
    }

    public String getBreadRoll() {
        return breadRoll;
    }
}
