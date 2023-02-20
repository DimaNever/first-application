package com.dmdev.cs.practice.arrays;

import java.util.Arrays;

/**
 * Напишите программу, которая циклически сдвигает элементы массива вправо на одну позицию,
 * и печатает результат. Цикличность означает, что последний элемент массива становится
 * самым первым его элементом.
 */
public class Task1 {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println(Arrays.toString(values));

//        shiftArray(values);
//        System.out.println(Arrays.toString(values));
//        shiftArray(values);
//        System.out.println(Arrays.toString(shiftArray(values)));
//        System.out.println(Arrays.toString(values));

        int[] arr1 = shiftArray(values);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(shiftArray(arr1)));

//        shiftRight(values);
//        System.out.println(Arrays.toString(values));
//        shiftRight(values);
//        System.out.println(Arrays.toString(values));


    }

    private static int[] shiftArray(int[] values) {
        int[] array = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            if (i + 1 == values.length) {
                array[0] = values[values.length - 1];
            } else {
                array[i + 1] = values[i];
            }
        }
        return array;
    }

    public static void shiftRight(int[] values) {
        int lastElement = values[values.length - 1];
        for (int i = values.length - 1; i > 0; i--) {
            values[i] = values[i - 1];
        }
        values[0] = lastElement;
    }
}

