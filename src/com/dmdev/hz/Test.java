package com.dmdev.hz;

import java.util.Arrays;

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

        for (int i = 0; i < array.length; i++) {
            if (array[0] == array[i] && 0 != i){
                System.out.println(array[i]);
            }

        }

    }


}

