package com.techelevator;

public class Snacks {

    private String slotLocation;
    private String productName;
    private double price;
    private String type;
<<<<<<< HEAD
   private int ammount = 5;
=======
    private int amountInStock;
    InputFile inputFile = new InputFile();
>>>>>>> a6d35fa6ea4e22161b74210de88269d6aeff6770


    public Snacks(String slotLocation, String productName, double price, String type) {
        this.slotLocation = slotLocation;
        this.productName = productName;
        this.price = price;
        this.type = type;
        amountInStock = 5;
    }

    public int getAmountInStock() {
        return amountInStock;
    }

<<<<<<< HEAD
=======
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
>>>>>>> a6d35fa6ea4e22161b74210de88269d6aeff6770
}
