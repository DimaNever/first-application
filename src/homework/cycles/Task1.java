package homework.cycles;

import java.util.Scanner;

/**
 * Посчитать четные и нечетные цифры целого числа и вывести их на консоль.
 * Для решения написать 2 функции, которые будут принимать введенное целое число,
 * а возвращать количество четных цифр (вторая функция - нечетных).
 * <p>
 * Например: если введено число 228910, то у него 4 четные цифры (2, 2, 8, 0) и 2 нечетные (9, 1).
 */
public class Task1 {
    public static void main(String[] args) {
        int value = getValue();

        System.out.println("Количество четных цифр: " + countEven(value));
        System.out.println("Количество нечетных цифр: " + countOdd(value));
    }

    private static int getValue() {
        System.out.println("Введите целое число.");
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextInt()) {
            System.out.println("Вы ввели не целое число. \nПожалуйста повторите ввод.");
            Scanner sc1 = new Scanner(System.in);
            sc = sc1;
        }
        int value = sc.nextInt();
        return value;
    }

    public static int countEven(int value) {
        if (value == 0) {
            return 1;
        }
        if (value < 0) {
            value *= -1;
        }
        int counterEven = 0;
        while (value > 0) {
            if (value % 2 == 0) {
                counterEven++;
            }
            value /= 10;
        }
        return counterEven;
    }

    public static int countOdd(int value) {
        if (value == 0) {
            return 0;
        }
        if (value < 0) {
            value *= -1;
        }

        int counterOdd = 0;
        while (value > 0) {
            if (value % 2 != 0) {
                counterOdd++;
            }
            value /= 10;
        }
        return counterOdd;
    }
}



