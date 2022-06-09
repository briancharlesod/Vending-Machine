package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SnacksMapMethods {
    public Map<String, Snacks> snacksMap = new LinkedHashMap<>();
    private String filePath = "vendingmachine.csv";
    Balance balance = new Balance();

    public void createMap() {
        File newFile = new File(filePath);

        try { Scanner reader = new Scanner(newFile);
            while (reader.hasNextLine()) {

                String line = reader.nextLine();
                String[] myArr = line.split("\\|");
                double h = Double.parseDouble(myArr[2]);
                Snacks snacks = new Snacks(myArr[0], myArr[1], h, myArr[3]);
                snacksMap.put(myArr[0], snacks);


            }
        } catch (FileNotFoundException e) {
            System.out.println("Not Valid File");
        }


    }

    public String displayItemsForSale(){
        for(String i : snacksMap.keySet()){
            System.out.println(snacksMap.get(i));
        }
        return "";
    }

    public Map<String, Snacks> getSnacksMap() {
        return snacksMap;
    }

    public void put(String f, Snacks e){
        snacksMap.put(f, e);
    }

    public String purchaseItem(String itemNumber){
        String m = "Didn't work";
        if(snacksMap.containsKey(itemNumber)){
            if(snacksMap.get(itemNumber).getAmountInStock() > 0){
                if(balance.getRemainingBalance() >= snacksMap.get(itemNumber).getPrice()){
                    balance.setRemainingBalance(balance.getRemainingBalance() - snacksMap.get(itemNumber).getPrice());
                    snacksMap.get(itemNumber).setAmountInStock(snacksMap.get(itemNumber).getAmountInStock() - 1);
                    m = snacksMap.get(itemNumber).getProductName() + " " + snacksMap.get(itemNumber).getPrice() + " " + balance.getRemainingBalance() + " " + snacksMap.get(itemNumber).getSound();
                    return m;
                } else {
                    m = "Sorry, not enough $$";
                }
            } else {
                m = "Sorry bud, we're out of stock";
            }
        } else{
            m = "Item does not exist";
        }
        return m;
    }

    }

