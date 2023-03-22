package com.dmdev.level2.practice.exceptionex;

import com.dmdev.level2.practice.exceptionex.task3.ExceptionXXX;

/**
 * Повторить предыдущее упражнение, но наследуя свой класс от класса
 * RuntimeException.
 * Добавить в конструктор своего класса возможность указания
 * сообщения.
 */
public class Task4 {

    public static void main(String[] args) {
        try {
            catchCustomEx();

        } catch (ExceptionXXX exceptionXXX){
            System.out.println("catch in MAIN");
            exceptionXXX.printStackTrace();
        }
    }

    private static void catchCustomEx() {
        try {
            unsafe();
        } catch (RuntimeException runtimeException){
            System.out.println("Catch in catchCustomEx method");
            throw new ExceptionXXX(runtimeException);
        }
    }

    public static void unsafe(){
        throw new RuntimeException("Ooops");
    }
}
