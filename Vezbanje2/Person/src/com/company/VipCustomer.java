package com.company;

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String emailAdress;

    public VipCustomer(String name, double creditLimit, String emailAdress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAdress = emailAdress;
    }

    public VipCustomer() {
        this("Default name",1000.0,"defaultEmail@email.com");
    }
    public VipCustomer(String name,double creditLimit){
        this(name,creditLimit,"enknown@email.com");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAdress() {
        return emailAdress;
    }
}
