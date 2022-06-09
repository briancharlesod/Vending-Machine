package com.techelevator;

public class SnacksMapMethods {
    InputFile inputFile = new InputFile();

    public String getPurchaseItem(String itemNumber) {
        String displayMessage = "Whoops, item not found.";
        for (String item : inputFile.snacksMap.keySet()) {
            if (inputFile.snacksMap.containsKey(itemNumber) && inputFile.snacksMap.get(itemNumber).getAmountInStock() >= 1) {
                displayMessage = ;
            }
        }

        return displayMessage;

    }

}
