package com.techelevator;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
    InputFile input = new InputFile();
    input.initiateFile();
    Scanner keyboard = new Scanner(System.in);

        System.out.println(input.snacksMap.get("A1"));
        for (String i: input.snacksMap.keySet()){
            System.out.println( input.snacksMap.get(i));
        }







    }
}
