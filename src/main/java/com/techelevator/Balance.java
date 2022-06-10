package com.techelevator;

import java.text.DecimalFormat;

public class Balance {

    public static double remainingBalance = 0;
    private DecimalFormat df = new DecimalFormat("0.00");

    public String getDisplayBalance() {
        return df.format(remainingBalance);
    }

    public static double getRemainingBalance() {
        return remainingBalance;
    }

    public String getStringBalance(){
        String m = "Current Balance is: " + getRemainingBalance();
        return m;
    }

    public static void setRemainingBalance(double currentBalance1) {
        remainingBalance = currentBalance1;
    }

    public String change() {
        String l = "Your change is ";
        if (remainingBalance == 0) {
            l = l + "0";
        }

        double tempRemainder = remainingBalance * 100;
        int remainder = (int)tempRemainder;
        int quarters = remainder / 25;
        remainder = remainder % 25;
        int dimes = remainder / 10;
        remainder = remainder % 10;
        int nickels = remainder / 5;
        if (quarters > 0) {
            l = l + quarters + " Quarters ";
        }
        if (dimes > 0) {
            l = l + dimes + " Dimes ";
        }
        if (nickels > 0) {
            l = l + nickels + " Nickels ";
        }
        setRemainingBalance(0);

        return l;

    }
}
