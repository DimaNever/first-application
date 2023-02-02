package com.dmdev.cs.lesson18;

public class Task2 {
    public static void main(String[] args) {
        int value = 5;
        int cube = cube(value);
        System.out.println(cube);
    }

    public static int cube(int value) {
        return value * value * value;
    }
}
