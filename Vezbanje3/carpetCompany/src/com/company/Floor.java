package com.company;
//The Carpet Company has asked you to write an application that
//        calculates the price of carpeting for rectangular rooms.
//        To calculate the price, you multiply the area of the floor
//        (width times length) by the price per square meter of carpet.
//        For example, the area of the floor that is 12 meters long and 10 meters wide
//        is 120 square meters. To cover the floor with a carpet that costs $8 per square
//        meter would cost $960.


public class Floor {

    private double width,length;

    public Floor(double width,double length){
        this.width = width;
        this.length = length;
        if(width < 0){
            this.width = 0;
        }
        if(length < 0){
            this.length = 0;
        }
    }
    public double getArea(){
        return width * length;
    }
}
