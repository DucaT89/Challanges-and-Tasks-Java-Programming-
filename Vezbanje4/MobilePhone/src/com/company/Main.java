package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("0066 444 3321");

    public static void main(String[] args) {

        boolean quit = false;
        startPhone();
        printActions();
        while(!quit){
            System.out.println("\nEnter action: (6 to show actions again)");
            int action = Integer.parseInt(scanner.nextLine());

            switch (action){
                case 0: System.out.println("\nShutting down..");
                        quit = true;
                        break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                case 4:
                   removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }

        }
    }


    private static void startPhone(){
        System.out.println("Starting phone...");
    }
    private static void addNewContact(){
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number : " );
        String phoneNumber = scanner.nextLine();
        Contacts newContact = Contacts.createContact(name,phoneNumber);
        if(mobilePhone.addNewContact(newContact)){
            System.out.println("New contact added: name = "+ name + ", phone = "+ phoneNumber);
        }else {
            System.out.println("Cannot add, "+ name + " already on file.");
        }
    }
    private static void updateContact(){
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contacts existingContact =  mobilePhone.queryContact(name);
        if(existingContact == null){
            System.out.println("Contact not found");
            return;
        }
        System.out.print("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new phone number");
        String newNumber = scanner.nextLine();
        Contacts newContact = Contacts.createContact(newName,newNumber);
        if(mobilePhone.updateContact(existingContact,newContact)){
            System.out.println("Successfully updated contact");
        }
        else {
            System.out.println("Error while updating");
        }
    }
    private static void removeContact(){
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contacts existingContact =  mobilePhone.queryContact(name);
        if(existingContact == null){
            System.out.println("Contact not found");
            return;
        }
        if(mobilePhone.removeContact(existingContact)){
            System.out.println("Successfully removed");
        }else{
            System.out.println("Error while removing");
        }

    }
    private static void queryContact(){
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contacts existingContact =  mobilePhone.queryContact(name);
        if(existingContact == null){
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Name: "+ existingContact.getName() + ",phone: "+existingContact.getPhoneNumber());
    }


    private static void printActions(){
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0 - to shutdown\n" +
                           "1 - to print contacts\n" +
                           "2 - to add contatct\n"+
                           "3 - to update contact\n"+
                           "4 - to remove contact\n"+
                           "5 - query if an existing contact exist\n"+
                           "6 - to print a list of available actions");
        System.out.println("Choose your action : ");
    }
}
