package com.dmdev.cs.lesson19;

import java.util.Scanner;

/**
 * Написать программу, вычисляющую корни квадратного уравнения вида ax ² + bx + c = 0,
 * где a, b и c - целочисленные параметры функции run.

 * Вывести корни квадратного уравнения на консоль.
 * Если их два, то перечислить каждый с новой строки в консоли
 * (просто использовать два раза System.out.println).
 * Если дискриминант отрицательный, вывести на консоль сообщение "нет корней".

 * При решении создать и использовать следующие функции:
 * - функция isPositive, определяющая, является ли число положительным
 * - функция isZero, определяющая, является ли число нулём
 * - функция discriminant, вычисляющая дискриминант

 * Обращайте внимание, что параметры все целочисленные, а корни могут иметь дробную часть.
 */

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input value of a");
        int a = sc.nextInt();
        System.out.println("Input value of b");
        int b = sc.nextInt();
        System.out.println("Input value of c");
        int c = sc.nextInt();
        int d = discriminant(a, b, c);
        System.out.println("diskrim = " + d);
        System.out.println(isPositive(d));
        System.out.println(isZero(d));
        run(a,b,c,d);



    }

    public static int discriminant(int a, int b, int c) {
        return b * b - 4 * a * c;
    }
    public static boolean isPositive(int d){
        return d > 0;
    }
    public static boolean isZero(int d){
        return d == 0;
    }
    public static void run(int a, int b, int c, int d){
        if (isPositive(d)){
            double x1 = (-b - Math.sqrt(d)) / (2 * a);
            double x2 = (-b + Math.sqrt(d)) / (2 * a);
            System.out.println("X1 = " + x1);
            System.out.println("X2 = " + x2);
        } else if (isZero(d)) {
            double x = - b / (2 * (double)a);
            System.out.println("X = " + x);
        } else {
            System.out.println("X = NOT:)");
        }
    }
}
