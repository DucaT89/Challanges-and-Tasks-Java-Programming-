package com.company;

public class DeLuxBurger extends Burger {

    private String name;
    private String breadRoll;
    private int meatNumber;

    public DeLuxBurger() {
        this.name = "DeLux";
        this.meatNumber = 3;
        this.breadRoll = "Susame";
    }

    @Override
    public double getPrice() {
        System.out.println("====================");
        System.out.println(this.getName() + " burger comes with soda and frech fries \n" +
                "in total for the meal = 7.99");
        return 7.99;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getBreadRoll() {
        return breadRoll;
    }

    @Override
    public int getMeatNumber() {
        return meatNumber;
    }
}
