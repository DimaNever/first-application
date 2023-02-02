package com.dmdev.cs.lesson16;

public class Task1 {
    public static void main(String[] args) {
        for (int month = 1; month < 15; month++) {


            if (month == 12 || month == 1 || month == 2) {
                System.out.println("Numder of month " + month + " is Winter");
            } else if (2 < month && month < 6) {
                System.out.println("Numder of month " + month + " is Spring");
            } else if (5 < month && month < 9) {
                System.out.println("Numder of month " + month + " is Summer");
            } else if (8 < month && month < 12) {
                System.out.println("Numder of month " + month + " is Autumn");
            } else {
                System.out.println("Number of month " + month + " is invalid");
            }
        }
    }
}
