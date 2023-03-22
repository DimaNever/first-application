package com.dmdev.level2.practice.exceptionex;

public class ExceptionEx {

    public static void main(String[] args) throws RuntimeException {
        System.out.println("main start");
        try {
            unsafe(10);

        } catch (RuntimeException runtimeException) {
            System.out.println("*******************");
//        }
//         catch (FileNotFoundException e) {
//            System.out.println("--------------------");
        } finally {
            System.out.println("finally");
        }
        System.out.println("main end");
    }

    public static void unsafe(int value) throws RuntimeException {
        System.out.println("unsafe start");
        if (value > 0) {
            throw new RuntimeException();
        }
        System.out.println("unsafe end");
    }
}
