package com.dmdev.cs.lesson21;

public class Task4 {
    public static void main(String[] args) {
        int value = 53;
        System.out.println(isSimple(value));
    }

    private static boolean isSimple(int value) {

        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                return false;
            }
        }

        return true;
    }
}
