package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SnacksTests {
    SnacksMap snacksMap;

    @Before
    public void Init(){
        snacksMap = new SnacksMap();
        snacksMap.createMap();
    }

    @Test
    public void getProductNameForCloudPopcorn(){
        String expected = "Cloud Popcorn";
        String actual = snacksMap.snacksMap.get("A4").getProductName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCrunchiePriceWorks(){
        double expected = 1.75;
        double actual = snacksMap.snacksMap.get("B4").getPrice();
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void getTypeOfGum(){
        String expected = "Gum";
        String actual = snacksMap.snacksMap.get("D3").getType();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void getChipSound(){
        String expected = "Crunch Crunch, Yum!";
        String actual = snacksMap.snacksMap.get("A1").getSound();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCandySound(){
        String expected = "Munch Munch, Yum!";
        String actual = snacksMap.snacksMap.get("B1").getSound();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getDrinkSound(){
        String expected = "Glug Glug, Yum!";
        String actual = snacksMap.snacksMap.get("C1").getSound();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getGumSound(){
        String expected = "Chew Chew, Yum!";
        String actual = snacksMap.snacksMap.get("D1").getSound();
        Assert.assertEquals(expected, actual);
    }
}
