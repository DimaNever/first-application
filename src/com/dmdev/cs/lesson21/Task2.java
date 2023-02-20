package com.dmdev.cs.lesson21;

public class Task2 {
    public static void main(String[] args) {
        int value = -12345;
        System.out.println(getSum(value));
        System.out.println(sum(value));

    }
    public static int getSum(int value){
        int result = 0;
        //int currentValue;
//        if (value < 0){
//            currentValue = value * -1;
//        } else {
//            currentValue = value;
//        }
        int currentValue = (value > 0 ? value : value * -1);
        while (currentValue > 0 ){

            result += currentValue % 10;
            currentValue /= 10;
        }
        return result;
    }
    public static int sum(int value){
        int result = 0;
        for (int i = (value > 0 ? value : value * -1); i > 0; i /= 10) {
            int x = i % 10;
            result += x;
        }
        return result;
    }
}
