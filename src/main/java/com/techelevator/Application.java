package com.techelevator;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
    InputFile input = new InputFile();
    input.initiateFile();
    Scanner keyboard = new Scanner(System.in);


    
        System.out.println(input.snacksMap.get("A1"));
        for (String i: input.snacksMap.keySet()){
            System.out.println( input.snacksMap.get(i));
        }




//        System.out.println(input.snacksMap.get("A1"));
//        for (String i: input.snacksMap.keySet()){
//            System.out.println( input.snacksMap.get(i));
//        }

        SnacksMapMethods snacks = new SnacksMapMethods();
        snacks.createMap();
        System.out.println(snacks.displayItemsForSale());

        System.out.println(snacks.purchaseItem("A8"));


        userInterface.mainMenu();
        
    }
}
