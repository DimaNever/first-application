package com.dmdev.cs.practice.cycle;

import java.util.Scanner;

/**
 * Написать программу, вычисляющую сумму цифр введённого пользователем целого числа.
 */
public class Task1 {
    public static void main(String[] args) {
        extracted();
    }

    private static void extracted() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число и через мгновение узнаете сумму всех его цифр)");
        long x = sc.nextLong();
        int res = getRes(x);
        System.out.println("Итак, сумма равна: " + res);
    }

    private static int getRes(long x) {
        int res=0;
        while (x != 0){
            res += x % 10;
            x /= 10;
        }
        return res;
    }

}
