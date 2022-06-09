package com.techelevator;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
    InputFile input = new InputFile();
    input.initiateFile();

    for (String i :input.getSnacksMap().keySet()){
        System.out.println(input.snacksMap.get(i));
    }




    }
}
