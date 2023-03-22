package com.dmdev.level2.practice.exceptionex.task3;

/**
 * 3. Создать собственный класс-исключение - наследник класса Exception.
 *  Создать метод, выбрасывающий это исключение.
 *  Вызвать этот метод и отловить исключение. Вывести stack trace в консоль.
 */
public class Task3 {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            try {
                ExceptionXXX.excepXXX(i);
            } catch (ExceptionXXX e) {
                System.err.println(e.getCause());
                e.printStackTrace();
            }
        }
    }
}
