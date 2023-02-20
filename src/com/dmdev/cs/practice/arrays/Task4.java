package com.dmdev.cs.practice.arrays;

import java.util.Arrays;

/**
 * Написать функцию linearize, которая принимает в качестве параметра двумерный массив
 * и возвращает одномерный массив со всеми элементами двумерного.
 */
public class Task4 {
    public static void main(String[] args) {
        int[][] values = {
                {1},
                {2, 3},
                {4, 5, 6}
        };
        System.out.println(Arrays.toString(linearize(values)));

    }

    public static int[] linearize(int[][] values) {
        int size = 0;
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j <= i; j++) {
                size++;
            }
        }
        int[] result = new int[size];
        int currentIndex = 0;
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                result[currentIndex] = values[i][j];
                currentIndex++;
            }
        }


        return result;
    }
}
