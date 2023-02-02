package com.dmdev.cs.lesson16;

/**
 * 3. Имеется целое число. Это число - сумма денег в рублях.
 * Вывести это число, добавив к нему слово "рубль" в
 * правильном падеже ("рубль", "рублей", "рубля").
 */
public class Task3 {
    public static void main(String[] args) {
        for (int rub = -121; rub < 2200; rub++) {

            if (rub < 0) {
                System.out.println("Rubles variable is invalid: " + rub);
            } else if (5 <= rub % 10 && rub % 10 <= 9 ||
                    11 <= rub % 100 && rub % 100 <= 19 ||
                    rub % 10 == 0) {
                System.out.println(rub + " рублей");

            } else if (2 <= rub % 10 && rub % 10 <= 4) {
                System.out.println(rub + " рубля");
            } else if (rub % 10 == 1) {
                System.out.println(rub + " рубль");
            }
        }

//        for (int rub = -121; rub < 2200; rub++) {
//
//            if (5 <= rub % 10 && rub % 10 <= 9 ||
//                    11 <= rub % 100 && rub % 100 <= 19 ||
//                    rub % 10 == 0 && rub > 0) {
//                System.out.println(rub + " рублей");
//            } else if (2 <= rub % 10 && rub % 10 <= 4) {
//                System.out.println(rub + " рубля");
//            } else if (rub % 10 == 1) {
//                System.out.println(rub + " рубль");
//            } else if (rub < 0) {
//                System.out.println("Rubles variable is invalid: " + rub);
//            }
//        }
    }
}





