package com.dmdev.cs.practice.cycle;

import java.util.Scanner;

/**
 * Написать программу, вычисляющую и отображающую все числа Фибоначчи
 * меньше введённого пользователем целого числа.
 * Решить двумя способами: с помощью цикла и с помощью рекурсии.
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число и через мгновение узнаете все числа Фибоначчи меньше введённого)");
        int x = sc.nextInt();
        int a = 0;
        int b = 1;

        fib(a, b, x);

        while (b < x) {
            System.out.println(b);
            int next = a + b;
            a = b;
            b = next;

        }


    }

    public static void fib(int a, int b, int x) {
        if (b < x) {
            System.out.println(b);
            fib(b, a + b, x);
        }


    }
}
