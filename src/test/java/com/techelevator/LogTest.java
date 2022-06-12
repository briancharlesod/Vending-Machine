package com.techelevator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class LogTest {
    Log log = new Log();
    UserInterface user = new UserInterface();

    SnacksMap snack = new SnacksMap();
    Balance balance = new Balance();


    @Before
    public void before() {
        snack.createMap();
    }

    @After
    public void after() {
        balance.setRemainingBalance(0.0);
    }

@Test
    public void spendTest() {
        balance.setRemainingBalance(10);
    String output = log.spendLog(snack.snacksMap.get("B2"));
    Assert.assertEquals("Cowtales B2 $1.5 $10.0", output);
}

@Test
    public void feedTest() {

        String output = log.feedLog(10);
        Assert.assertEquals("FEED MONEY: $10.0 $0.0", output);
}

@Test
    public void changeTest() {

        String output = log.changeLog(7.0);
        Assert.assertEquals("GIVE CHANGE: $7.0 $0.00", output);
}
}
