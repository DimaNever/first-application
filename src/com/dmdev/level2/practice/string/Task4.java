package com.dmdev.level2.practice.string;

/**
 * 4. Подсчитать количество всех точек, запятых и восклицательных знаков в
 * строке.
 */
public class Task4 {
    public static void main(String[] args) {
        String value = " sdfsfsf., .... !sfsf.,?sfsdfsf!dfsfsf";
        System.out.println(countSymbols(value));
    }

    private static int countSymbols(String value){
        return value.length() - value.replace(".", "")
                .replace(",","")
                .replace("!","")
                .length();
    }

}
