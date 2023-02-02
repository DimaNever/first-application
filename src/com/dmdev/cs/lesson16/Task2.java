package com.dmdev.cs.lesson16;

/**
 * 2. Дано целое число. Определить, является ли последняя цифра этого
 * числа – цифрой 3.
 */
public class Task2 {
    public static void main(String[] args) {
        int x = -36545643;
        if (x % 10 == 3 ||x % 10 == -3) {
            System.out.println("4islo zakan4ivaetsa na 3");
        } else {
            System.out.println("4islo NE zakan4ivaetsa na 3");
        }
    }
}
