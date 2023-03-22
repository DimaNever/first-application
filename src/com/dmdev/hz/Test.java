package com.dmdev.hz;

/**
 * input
 * [1 3 4 3 5 2 1 2 4]
 * <p>
 * output
 * 5
 */
public class Test {
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 3, 5, 2, 1, 2, 4};
        int[] array1 = {1, 3, 4, -89, 5, 2, 1, 2, 4, 3, 5};

        System.out.println(exclusiveNumber(array));
        System.out.println(exclusiveNumber(array1));
    }

    public static int exclusiveNumber(int[] array) {
        int exclusive = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j] && i != j) {
                    array[i] = Integer.MIN_VALUE;
                    array[j] = Integer.MIN_VALUE;
                }
            }
        }

        for (int j : array) {
            if (j > Integer.MIN_VALUE) {
                exclusive = j;
            }
        }
        return exclusive;
    }
}

