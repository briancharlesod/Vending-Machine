package com.techelevator;

public class Snacks {

    private String slotLocation;
    private String productName;
    private double price;
    private String type;
    private int amountInStock = 5;


    public Snacks(String slotLocation, String productName, double price, String type) {
        this.slotLocation = slotLocation;
        this.productName = productName;
        this.price = price;
        this.type = type;
    }

    public int getAmountInStock() {
        return amountInStock;
    }

    public void purchaseItem(String itemNumber){
    }

    public String getSound(){
        String message = "No snack found!";
        if(type.equals("chip")){
            message = "Crunch Crunch, Yum!";
        } else if(type.equals("candy")){
            message="Munch Munch, Yum!";
        } else if(type.equals("drink")){
            message="Glug Glug, Yum!";
        } else if(type.equals("gum")){
            message = "Chew Chew, Yum!";
        }
        return message;
    }
}
