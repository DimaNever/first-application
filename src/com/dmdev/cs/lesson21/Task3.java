package com.dmdev.cs.lesson21;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(sum(2022));
    }

    public static double sum(int year) {
        double result = 24;
        double result2 = 24;
        for (int i = 1626 + 1; i <= year; i++) {
            double print = result * 0.05;
            result += print;
            result2 *= 1.05;
            System.out.println(result + " : " + i + " : " + result2 + "***" + print);
        }
        return result;
    }
}
