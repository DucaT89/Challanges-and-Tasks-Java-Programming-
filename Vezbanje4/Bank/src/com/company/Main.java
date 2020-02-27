package com.company;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("NLB");
        bank.addBranch("First");
        bank.addCustomer("First","John",50.5);
        bank.addCustomer("First","Tim",150.25);
        bank.addCustomer("First","Sam",250.75);

        bank.addBranch("Second");
        bank.addCustomer("Second","Bob",123.45);

        bank.addCustomerTransaction("First","John",43.3);
        bank.addCustomerTransaction("First","John",11.3);
        bank.addCustomerTransaction("First","Tim",3.3);

        bank.listCustomers("First",true);


    }
}
