package com.dmdev.cs.practice.arrays;

import java.util.Arrays;

/**
 * Написать программу, удаляющую все повторяющиеся целые числа из массива и печатающую результат.
 * Массив должен использоваться тот же самый. На место удаленных элементов ставить цифру 0.
 */
public class Task2 {
    public static void main(String[] args) {
        int[] values = {1, 6, 1, 4, 8, 9, 9, 6, 7, 5};
        System.out.println(Arrays.toString(values));
        removeDublicate(values);
        System.out.println(Arrays.toString(values));
    }

    public static void removeDublicate(int[] v) {
        for (int i = 0; i < v.length; i++) {
            for (int j = i + 1; j < v.length; j++) {
                if (v[i] == v[j]){
                    v[j] = 0;
                }
            }
        }
    }
}
