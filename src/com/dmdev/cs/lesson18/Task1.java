package com.dmdev.cs.lesson18;

public class Task1 {
    public static void main(String[] args) {
        int first = 100, second = 300;
        int max = Task1.getMax(first, second);
        System.out.println(max);

    }

    public static int getMax(int value1, int value2) {
        return value1 > value2 ? value1 : value2;
//        if (value1 > value2) {
//            return value1;
//        } else {
//            return value2;
//        }
    }
}
