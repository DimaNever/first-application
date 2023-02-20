package com.dmdev.cs.practice.cycle;

import java.util.Scanner;

/**
 * Написать программу, отображающую статистику по осадкам за N дней.
 * N вводится пользователем.
 * Пользователь также должен ввести N целых чисел,
 * обозначающих величину осадков в день.
 * <p>
 * Программа должна выводить:
 * a. Количество дней
 * b. Сумму осадков за этот период
 * c. Среднее количество осадков за этот период
 * d. Максимальное количество дневных осадков за этот период
 * <p>
 * Не использовать массивы!
 */
public class Task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество дней: ");
        int days = sc.nextInt();
        pogodka(sc, days);

    }

    private static void pogodka(Scanner sc, int days) {
        int sumOsadki = 0;
        int d = 0;
        int maxOsadki = 0;
        for (int i = 1; i < days + 1; i++) {
            System.out.print("Введите количество осадков день №" + i + ": ");
            int precipitation = sc.nextInt();
            if (precipitation > maxOsadki) {
                maxOsadki = precipitation;
                d = i;
            }
            sumOsadki += precipitation;

        }
        System.out.println("Количество дней: " + days);
        System.out.println("Сумма осадков за этот период: " + sumOsadki);
        System.out.println("Среднее количество осадков за этот период: " + (double) sumOsadki / days);
        System.out.println("Максимальное количество дневных осадков за этот период: " + maxOsadki);
    }
}
