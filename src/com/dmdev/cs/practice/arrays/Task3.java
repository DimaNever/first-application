package com.dmdev.cs.practice.arrays;

import java.util.Arrays;

/**
 * Заданы 2 массива целых чисел произвольной длины.
 * Написать программу, создающую третий массив, представляющий собой слияние 2-х заданных.
 * <p>
 * Пример:
 * 1-й массив: {1, 2, 3, 4, 5}
 * <p>
 * 2-й массив: {5, 6, 7}
 * <p>
 * Результат: {1, 5, 2, 6, 3, 7, 4, 5}
 */
public class Task3 {
    public static void main(String[] args) {
        int[] values1 = {1, 2, 3, 4, 5};
        int[] values2 = {5, 6, 7};
        System.out.println(Arrays.toString(merge(values1, values2)));
    }

    public static int[] merge(int[] values1, int[] values2) {
        int[] result = new int[values1.length + values2.length];
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < result.length; i++) {
            if (index1 < values1.length && index2 < values2.length) {
                result[i] = values1[index1];
                i++;
                index1++;
                result[i] = values2[index2];
                index2++;
            } else if (index1 < values1.length) {
                result[i] = values1[index1];
                index1++;
            } else if (index2 < values2.length) {
                result[i] = values1[index2];
                index2++;
            }
        }
        return result;
    }
}


