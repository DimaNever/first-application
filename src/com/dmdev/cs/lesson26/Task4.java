package com.dmdev.cs.lesson26;

public class Task4 {
    public static void main(String[] args) {
        int[] values = {1, 7, 0, 28, -24, 109, 5};
        System.out.println(getMinIndex(values));
        System.out.println(getMaxIndex(values));
    }

    public static int getMinIndex(int[] values) {
        int minIndex = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] < values[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static int getMaxIndex(int[] values) {
        int maxIndex = 0;
        for (int i = 0; i < values.length; i++) {
            int max = values[0];
            if (values[i] > values[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
