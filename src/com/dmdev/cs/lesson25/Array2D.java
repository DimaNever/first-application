package com.dmdev.cs.lesson25;

import java.util.Arrays;

public class Array2D {
    public static void main(String[] args) {
        int[][] values = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("--------------");
        for (int i = 0; i < values.length; i++) {
            int[] array = values[i];
            for (int j = 0; j < array.length; j++) {
                array[j] *= 2;
                System.out.print(array[j] + " ");
            }
            System.out.println();
        }
        System.out.println("--------------");

        for (int[] value : values) {
            for (int i : value) {
                i *= 2;
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println("--------------");

        for (int[] value : values) {

            System.out.println(Arrays.toString(value));
        }


    }

}
