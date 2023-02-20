package com.dmdev.level2.practice.string;

/**
 * Проверить, является ли введённая строка палиндромом, т.е. читается одинаково в обоих направлениях.
 */
public class Palindrome {
    public static void main(String[] args) {
        String as = "а роза упала на лапу азора";
        String sa = "qwertrewQ";

        System.out.println(as.replace(" ",""));
        System.out.println(as.replace(" ",""));

        System.out.println(isPalindrome(sa));
        System.out.println(isPalindrome(as));

    }

    private static String revers(String str) {
        char[] arr = str.toCharArray();
        String result = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            result += arr[i];
        }
        return result;
    }

    private static String reVERS(String str){
        return new StringBuilder(str).reverse().toString();
    }

    private static boolean isPalindrome(String str){
       return str.equalsIgnoreCase(revers(str.replace(" ", "")));
    }
}
