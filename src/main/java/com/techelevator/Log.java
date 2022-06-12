package com.techelevator;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Log {


        File log = new File("log.txt");
        public String dateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("MM/dd/yyyy h:mm:ss a"));



        public void feedLog(double fed) {
            try (PrintWriter writer = new PrintWriter(new FileWriter(log , true))) {
                String f = "FEED MONEY: $" + fed + " $" + Balance.remainingBalance;
                writer.println(dateTime + " " + f);
            } catch (Exception e) {
                System.out.println("log not found");
            }
        }

        public void spendLog(Snacks buy) {
            try (PrintWriter writer = new PrintWriter(new FileWriter(log, true))) {
                String s = buy.getProductName() + " "  + buy.getSlotLocation() + " $" + buy.getPrice() + " $" + Balance.remainingBalance;
                writer.println(dateTime + " " + s);
            } catch (Exception e) {
                System.out.println("log not found");
            }
        }

        public void changeLog(double change) {
            try (PrintWriter writer = new PrintWriter(new FileWriter(log, true))) {
                String c = "GIVE CHANGE: $" + change + " $0.00";
                writer.println(dateTime + " " + c);
            } catch (Exception e) {
                System.out.println("log not found");
            }

        }
        public void readLog() {

            try {
                Scanner reader = new Scanner(log);

                while (reader.hasNextLine()) {
                    System.out.println(reader.nextLine());
                }
            } catch (Exception e) {
                System.out.println("File not found");
            }



        }


    }



