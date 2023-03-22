package com.dmdev.level2.practice.exceptionex;

/**
 * 2. Написать код, который создаст, а затем отловит
 * ArrayIndexOutOfBoundsException.
 */
public class Task2 {

    public static void main(String[] args) {
        int[] ints = {1,2,3,4,5,6};
        try {
            for (int i = 0; i <= ints.length ; i++) {
                System.out.println(ints[i]);
            }
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.err.println("arrayIndex  " + arrayIndexOutOfBoundsException.getMessage());
            arrayIndexOutOfBoundsException.printStackTrace();
        }
    }
}
