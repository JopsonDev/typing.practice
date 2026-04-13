package com.pluralsight;

import java.util.Scanner;

public class typing {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int min = 1;
        int max = 10;
        int times = 10;
        while (times >= 0) {
            int number = (int) (Math.random() * (max - min + 1)) + min;
            System.out.println(number);

            String x = "";
            switch (number) {
                case 1 -> x = "sout";
                case 2 -> x = "Scanner myScanner = new Scanner(System.in);";
                case 3 -> x = "switch(){";
                case 4 -> x = "String();";
                case 5 -> x = "if (x==y) {";
                case 6 -> x = "souf";
                case 7 -> x = "Math.random();";
                case 8 -> x = "Math.sqrt();";
                case 9 -> x = "Math.max();";
                case 10 -> x = "Math.min();";
                default -> x = "Fail;";

            }
            System.out.println(x);
            System.out.print("Answer: ");
            String answer = myScanner.nextLine();
            if (x.equals(answer)) {
                System.out.println("Great job!");
            } else {
                System.out.println("WRONGGG");
            }
            times--;
        }
    }
}
