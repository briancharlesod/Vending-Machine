package com.techelevator;

public class SnacksMapMethods {
    InputFile inputFile = new InputFile();

    public String purchaseItem(String itemNumber){
        String displayMessage = "Whoops, item not found.";
        for(String item : inputFile.snacksMap.keySet()){
            if(inputFile.snacksMap.containsKey(itemNumber) && inputFile.snacksMap.get(itemNumber).getAmountInStock() >=1){
                    //need to include additional if statement that will make sure they have enough money to make purchase
                    displayMessage = inputFile.snacksMap.get(itemNumber).getProductName() + inputFile.snacksMap.get(itemNumber).getPrice() + inputFile.snacksMap.get(itemNumber).getSound();
                   //need to add the money left to the display msg
                    inputFile.snacksMap.get(itemNumber).setAmountInStock((inputFile.snacksMap.get(itemNumber).getAmountInStock() - 1));
                   //reset the stock amt in the map
                    //update amount of money left less purchase price
                } else if(inputFile.snacksMap.containsKey(itemNumber) && inputFile.snacksMap.get(itemNumber).getAmountInStock() ==0){
                displayMessage = "Sorry, out of stock!";
            }
            }
        return displayMessage;
    }

}
