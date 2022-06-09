package com.techelevator;

import java.util.HashMap;
import java.util.Map;

public class Application {
    public static void main(String[] args) {
    InputFile input = new InputFile();
    input.initiateFile();
        Map<String, Snacks> snacksMap = new HashMap<>();

        for (String i: snacksMap.keySet()) {
            System.out.println( snacksMap.get(i));
        }
    }
}
