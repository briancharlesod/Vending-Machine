package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SnacksMapTests {
    Balance balance;
    SnacksMap snacksMap;

    @Before
    public void Init(){
        balance = new Balance();
        snacksMap = new SnacksMap();
        snacksMap.createMap();
    }

    @Test
    public void purchaseItemWorking(){
        String expected = "Dr. Salt Cost $1.50 Remaining Balance: $3.50\n" +
                "Glug Glug, Yum!";
        balance.setRemainingBalance(5);
        String actual = snacksMap.purchaseItem("C2");
        Assert.assertEquals(expected, actual);
        balance.setRemainingBalance(0);
    }

    @Test
    public void purchaseItemReturnsOutOfStock(){
        String expected = "Item is all out of stock";
        snacksMap.snacksMap.get("D4").setAmountInStock(0);
        String actual = snacksMap.purchaseItem("D4");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void purchaseItemReturnsNotEnoughMoney(){
        String expected = "Sorry, not enough money to make purchase";
        String actual = snacksMap.purchaseItem("B3");
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void purchaseItemReturnsDoesNotExist(){
        String expected = "Item does not exist";
        String actual = snacksMap.purchaseItem("BB");
        Assert.assertEquals(expected, actual);
    }
}
