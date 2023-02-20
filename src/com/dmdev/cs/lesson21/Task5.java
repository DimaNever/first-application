package com.dmdev.cs.lesson21;

public class Task5 {
    public static void main(String[] args) {
        char start = 'f';
        printLetters(start);
    }

    private static void printLetters(char start) {
        for (char i = start; !isVowel(i); i++) {
            System.out.println(i);
        }
    }

    private static boolean isVowel(char i) {
        return i == 'a' || i == 'e' || i == 'o' || i == 'i' || i == 'u' || i =='y';
    }
}


