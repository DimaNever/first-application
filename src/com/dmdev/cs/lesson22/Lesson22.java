package com.dmdev.cs.lesson22;

public class Lesson22 {
    public static void main(String[] args) {
        int value = 5;
        System.out.println(factorialRec(value));
    }

    private static int factorialRec(int value) {
        if (value == 1){
            return 1;
        }
        return value * factorialRec(value -1);

    }

}
