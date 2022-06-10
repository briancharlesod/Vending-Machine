package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SnacksMap {
    public Map<String, Snacks> snacksMap = new LinkedHashMap<>();
    private String filePath = "vendingmachine.csv";
    DecimalFormat df = new DecimalFormat("0.00");
    Balance balance = new Balance();

    public void createMap() {
        File newFile = new File(filePath);

        if(!newFile.exists() || !newFile.isFile()){
            System.out.println("Not a valid file");
        }
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

    public String purchaseItem(String itemNumber){
        String m;
        int moneyLeft = (int)(balance.getRemainingBalance()*100);
        if(snacksMap.containsKey(itemNumber)){
            int snackPrice = (int)(snacksMap.get(itemNumber).getPrice() * 100);
            if(snacksMap.get(itemNumber).getAmountInStock() > 0){
                if(moneyLeft >= snackPrice){
                    balance.setRemainingBalance((moneyLeft - snackPrice) / 100.0);
                    snacksMap.get(itemNumber).setAmountInStock(snacksMap.get(itemNumber).getAmountInStock() - 1);
                    m = snacksMap.get(itemNumber).getProductName() + " $" + snacksMap.get(itemNumber).getPrice() + " " + balance.getRemainingBalance() + " " + snacksMap.get(itemNumber).getSound();
                    return m;
                } else {
                    m = "Sorry, not enough money to make purchase";
                }
            } else {
                m = "Item is all out of stock";
            }
        } else{
            m = "Item does not exist";
        }
        return m;
    }

    public String displayMode(String key){
        String price = df.format(snacksMap.get(key).getPrice());
        String displayProduct = snacksMap.get(key).getSlotLocation() + " " + snacksMap.get(key).getProductName() + " $" + price + " Stock: " + snacksMap.get(key).getAmountInStock();
        return displayProduct;
    }
}