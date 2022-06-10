package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InputFile {

private String filePath = "vendingmachine.csv";
//public Map<String, Snacks> snacksMap = new LinkedHashMap<>();



    public void initiateFile() {
    File newFile = new File("vendingmachine.csv");

try {
    Scanner reader = new Scanner(newFile);


    while (reader.hasNextLine()) {

        SnacksMap mappy = new SnacksMap();
        String line = reader.nextLine();
        String[] myArr = line.split("\\|");
        double h = Double.parseDouble(myArr[2]);
        Snacks snacks = new Snacks(myArr[0], myArr[1], h, myArr[3]);
        mappy.put(myArr[0], snacks);


    }
} catch (FileNotFoundException e) {
    System.out.println("Not Valid File");
}


}
}
