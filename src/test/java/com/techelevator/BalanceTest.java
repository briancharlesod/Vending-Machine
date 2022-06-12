package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class BalanceTest {
Balance balance = new Balance();

    @Test
    public void setBalanceTest(){
        double input = 3.0;
        balance.setRemainingBalance(input);
        Assert.assertEquals(3.0, balance.getRemainingBalance(), 0.0);
    }

    @Test
    public void getDisplayBalanceTest1() {
        balance.setRemainingBalance(4);
        Assert.assertEquals("4.00", balance.getDisplayBalance());
    }

    @Test
    public void getDisplayBalanceTest2() {
        balance.setRemainingBalance(1.5);
        Assert.assertEquals("1.50", balance.getDisplayBalance());
    }
    @Test
    public void getDisplayBalanceTest3() {
        balance.setRemainingBalance(0.5);
        Assert.assertEquals("0.50", balance.getDisplayBalance());
    }

    @Test
    public void oneD_fiveC_returns_fourQ_oneN(){
        double input = 1.05;
        balance.setRemainingBalance(input);
        String output = balance.change();
        Assert.assertEquals("Your change is 4 Quarters 1 Nickels ", output);
    }

    @Test
    public void twoD_fifteenC_returns_(){
        double input = 2.15;
        balance.setRemainingBalance(input);
        String output = balance.change();
        Assert.assertEquals("Your change is 8 Quarters 1 Dimes 1 Nickels ", output);
    }

    @Test
    public void thirtyfiveC_returns_oneQ_oneD(){
        double input = 0.35;
        balance.setRemainingBalance(input);
        String output = balance.change();
        Assert.assertEquals("Your change is 1 Quarters 1 Dimes ", output);
    }
}
