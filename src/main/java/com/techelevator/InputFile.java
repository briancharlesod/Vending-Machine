package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InputFile {

private String filePath = "vendingmachine.csv";
public Map<String, Snacks> snacksMap = new HashMap<>();

    public Map<String, Snacks> getSnacksMap() {
        return snacksMap;
    }

    public void initiateFile() {
    File newFile = new File("vendingmachine.csv");

try {
    Scanner reader = new Scanner(newFile);


    while (reader.hasNextLine()) {

        String line = reader.nextLine();
        String[] myArr = line.split("\\|");
        double h = Double.parseDouble(myArr[2]);
        Snacks snacks = new Snacks(myArr[0], myArr[1], h, myArr[3]);
        snacksMap.put(myArr[0], snacks);


    }
} catch (FileNotFoundException e) {
    System.out.println("Not Valid File");
}


}
}
