package com.dmdev.cs.lesson24;

import java.util.Arrays;

public class Lesson24 {
    public static void main(String[] args) {
        int a = 2;
        int b;
        int[][] ab = new int[5][4];

        for (int[] ins : ab) {
            System.out.println(Arrays.toString(ins));
        }
        System.out.println(Arrays.toString(ab));

        int[][][] abc = new int[2][2][2];
        for (int[][] ins : abc) {
            for (int[] qwe : ins) {
                //System.out.print("*");
                System.out.println("-" + Arrays.toString(qwe) + "+");
            }
        }
        System.out.println("---------------------------------------");

        int[][][][] abcd = new int[5][1][1][5];
        for (int[][][] ins : abcd) {
            for (int[][] qwe : ins) {
                for (int[] rty : qwe)
                System.out.println("-" + Arrays.toString(rty) + "+");
            }
        }
        System.out.println(Arrays.toString(abcd));

    }
}
