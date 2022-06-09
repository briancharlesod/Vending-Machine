package com.techelevator;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
    InputFile input = new InputFile();
    input.initiateFile();
    Scanner keyboard = new Scanner(System.in);

<<<<<<< HEAD
=======
    
        System.out.println(input.snacksMap.get("A1"));
        for (String i: input.snacksMap.keySet()){
            System.out.println( input.snacksMap.get(i));
        }


>>>>>>> 1df67921e8224c51280f2219a10878c54c963848

//        System.out.println(input.snacksMap.get("A1"));
//        for (String i: input.snacksMap.keySet()){
//            System.out.println( input.snacksMap.get(i));
//        }

        SnacksMapMethods snacks = new SnacksMapMethods();
        snacks.createMap();
        System.out.println(snacks.displayItemsForSale());

        System.out.println(snacks.purchaseItem("A8"));


    }
}
