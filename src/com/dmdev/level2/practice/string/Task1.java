package com.dmdev.level2.practice.string;

public class Task1 {
    public static void main(String[] args) {
        String s = "sfsf :( dgdfgdg :( dfgdg :) fghfgh :) fgdhfh :( dgdggdfg";
        String replace = replace(s);
        System.out.println(replace);
    }

    public static String replace(String value){
        return value.replace(":(", ":)");
    }
}
