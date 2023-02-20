package com.dmdev.level2.practice.string;

/**
 * 2. Написать функцию, принимающую 2 параметра: строку и слово - и
 * возвращающую true, если строка начинается и заканчивается этим словом.
 */
public class Task2 {
    public static void main(String[] args) {
        String s = "123 fghfh gfhfgh fghh 123";
        String a = "120";
        System.out.println(isStardAndEnd(s,a));
    }
    private static boolean isStardAndEnd(String target, String word){
        return target.startsWith(word) && target.endsWith(word);
    }
}
