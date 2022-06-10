package com.techelevator;

import java.text.DecimalFormat;

public class Balance {
    private double remainingBalance;
    private DecimalFormat df = new DecimalFormat("0.00");

    public double getRemainingBalance() {
        return remainingBalance;
    }

    public void setRemainingBalance(double remainingBalance) {
        this.remainingBalance = remainingBalance;
    }

    public String getDisplayBalance(){
        return df.format(remainingBalance);
    }
}
