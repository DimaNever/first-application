package com.dmdev.cs.lesson26;

public class Task5 {
    public static void main(String[] args) {
        int[] values = {1, 7, 0, 28, -24, 2, 8, -4, 109, 5, -30};
        System.out.println(sum0(values));
        System.out.println(sum(values));
        System.out.println(sum2(values));
    }

    public static int sum0(int[] values) {
        int sum = 0;
        int minIndex = Task4.getMinIndex(values);
        int maxIndex = Task4.getMaxIndex(values);
        if (minIndex < maxIndex) {
            for (int i = minIndex + 1; i < maxIndex; i++) {
                sum += values[i];
            }
        } else {
            for (int i = maxIndex + 1; i < minIndex; i++) {
                sum += values[i];
            }
        }
        return sum;
    }

    public static int sum(int[] values) {
        int sum = 0;
        int minIndex = Task4.getMinIndex(values);
        int maxIndex = Task4.getMaxIndex(values);
        int startIndex = Math.min(minIndex, maxIndex);
        int endIndex = Math.max(minIndex, maxIndex);
        for (int i = startIndex + 1; i < endIndex; i++) {
            sum += values[i];
        }
        return sum;
    }

    public static int sum2(int[] values) {
        int sum = 0;
        int startIndex = Task4.getMinIndex(values);
        int endIndex = Task4.getMaxIndex(values);
        if (endIndex < startIndex) {
            int temp = startIndex;
            startIndex = endIndex;
            endIndex = temp;
        }
        for (int i = startIndex + 1; i < endIndex; i++) {
            sum += values[i];
        }
        return sum;
    }


}
