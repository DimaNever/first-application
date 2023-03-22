package com.dmdev.level2.practice.exceptionex.task3;

public class ExceptionXXX extends RuntimeException{
    public ExceptionXXX(String message) {
        super(message);
    }

    public ExceptionXXX(Throwable cause) {
        super(cause);
    }

    public static void excepXXX(Integer integer) {

        if (integer == 5){
            throw new ExceptionXXX(new RuntimeException("Test exc"));
        } else {
            System.err.println(integer);
        }
    }
}
