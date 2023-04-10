package com.dmdev.level2.practice.regexex.tasks;
/**
 * 1. Написать программу, проверяющую, является ли введённая
 * строка адресом почтового ящика.
 * В названии почтового ящика разрешить использование только
 * букв, цифр и нижних подчёркиваний, при этом оно должно
 * начинаться с буквы.
 * Возможные домены верхнего уровня: .org .com
 */

import java.util.regex.Pattern;

public class Task1 {

    public static void main(String[] args) {
        String regex = "[a-zA-Z]\\w*@\\w{3,}\\.(org|com)";
        System.out.println(Pattern.matches(regex,"sfsdf@gmal.org"));
    }
}
