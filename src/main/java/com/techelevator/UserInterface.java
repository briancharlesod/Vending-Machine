package com.techelevator;

import java.util.Scanner;

public class UserInterface {
    Scanner keyboard = new Scanner(System.in);
    private String menuSelection;
    SnacksMap snacks = new SnacksMap();
    Balance balance = snacks.balance;

    public void mainMenu() {
        snacks.createMap();
        System.out.println("(1) Display Vending Machine Items");
        System.out.println("(2) Purchase");
        System.out.println("(3) Exit");
        menuSelection = keyboard.nextLine();
        if (menuSelection.equals("1") || menuSelection.equals("(1)")) {
            displayPurchaseItems();
            System.out.println();
            mainMenu();
        } else if (menuSelection.equals("2") || menuSelection.equals("(2)")) {
            purchaseMenu();
        } else if (menuSelection.equals("3") || menuSelection.equals("(3)")) {
            getChange();
            System.exit(0);
        } else {
            System.out.println("Invalid selection, please try again.");
            System.out.println();
            mainMenu();
        }
    }

    public void purchaseMenu(){
        System.out.println("Current Money Provided: $" + balance.getDisplayBalance());
        System.out.println("(1) Feed Money");
        System.out.println("(2) Select Product");
        System.out.println("(3) Finish Transaction");
        menuSelection = keyboard.nextLine();
        if(menuSelection.equals("1") || menuSelection.equals("(1)")){
            feedMoney();
            purchaseMenu();
        } else if(menuSelection.equals("2") || menuSelection.equals("(2)")){
            interfacePurchasing();
        } else if(menuSelection.equals("3") || menuSelection.equals("(3)")){
            getChange();
            mainMenu();
        } else{
            System.out.println("Invalid selection, please try again.");
            purchaseMenu();
        }
    }

    public void getChange(){
        int money = (int)(balance.getRemainingBalance() * 100);
        int quarters = money / 25;
        money = money % 25;
        int dimes = money / 10;
        money = money % 10;
        int nickels = money / 5;
        balance.setRemainingBalance(0.0);
        System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, and " + nickels + " nickels.");
        System.out.println("There is $" + balance.getDisplayBalance() + " balance remaining");
    }

    public void feedMoney(){
        System.out.print("How much would you like to add? $");
        String value = keyboard.nextLine();
        if(value == null){
            System.out.println("Please enter a valid amount of money.");
        }
        double money = Double.parseDouble(value);
        if(money <= 0){
            System.out.println("Please enter a valid amount of money.");
        } else {
            balance.setRemainingBalance(balance.getRemainingBalance() + money);
        }
    }

    public void interfacePurchasing(){
        displayPurchaseItems();
        System.out.print("Please enter the product number you'd like to purchase: ");
        String input = keyboard.nextLine();
        System.out.println(snacks.purchaseItem(input.toUpperCase()));
        System.out.println();
        purchaseMenu();
    }

    public void displayPurchaseItems(){
        for(String i : snacks.snacksMap.keySet()){
            if(snacks.snacksMap.get(i).getAmountInStock() == 0){
                System.out.println("SOLD OUT >> " + snacks.displayMode(i));
            } else {
                System.out.println(snacks.displayMode(i));
            }
        }
    }

}
