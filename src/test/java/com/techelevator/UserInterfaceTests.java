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

}
