package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserInterfaceTests {
private UserInterface userInterface;

@Before
    public void Init() {
    userInterface = new UserInterface();
}

@Test
    public void feedMoneyWholeDollars(){
        double expected = 10;
        double before = userInterface.balance.getRemainingBalance();
        userInterface.feedMoney("10");
        double after = userInterface.balance.getRemainingBalance();
        Assert.assertEquals(expected, after - before, 0.01);
}

@Test
    public void feedMoneyWithCents(){
    double expected = 8.85;
    double before = userInterface.balance.getRemainingBalance();
    userInterface.feedMoney("8.85");
    double after = userInterface.balance.getRemainingBalance();
    Assert.assertEquals(expected, after-before, 0.01);
}

@Test
    public void penniesShouldNotIncreaseBalance(){
    double expected = userInterface.balance.getRemainingBalance();
    userInterface.feedMoney("0.01");
    double actual = userInterface.balance.getRemainingBalance();
    Assert.assertEquals(expected, actual, 0.01);
}

}
