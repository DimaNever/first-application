package com.dmdev.cs.lesson21;

public class Task1 {
    public static void main(String[] args) {
        int value = 5;
        System.out.println(factorial(value));
        System.out.println(factorialWhile(value));
    }
    public static int factorial(int value){
        int result = 1;
        for (int i = 1; i <= value ; i++) {
            result *= i;
        }
        return result;
    }
    public static int factorialWhile(int value){
        int result = 1;
        int currentValue = 1;
        while (currentValue <= value){
        result *= currentValue;
        currentValue++;
        }
        return result;
    }
}
