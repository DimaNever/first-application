package com.dmdev.cs.lesson19;

/**
 * Имеются три числа - день, месяц и год, вводимые пользователем с консоли.
 * Вывести дату следующего дня в формате "День.Месяц.Год".
 * Учесть переход на следующий месяц, а также следующий год.
 * Форматирование строки "День.Месяц.Год" вынести в отдельную функцию.
 */

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input day");
        int day = sc.nextInt();
        System.out.println("Input month");
        int month = sc.nextInt();
        System.out.println("Input year");
        int year = sc.nextInt();
        //System.out.println(isValidDate(day, month, year));
        System.out.println(nextDay(day, month, year));

    }

    public static boolean isValidDate(int day, int month, int year) {
        if (0 >= day || day > 31 || 0 >= month || month > 12 || 0 > year) {
            return false;
        }
        if (month == 2) {
            if (isLeapYear(year)) {
                return day < 30;
            } else {
                return day < 29;
            }
        }
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return day < 31;
        } else {
            return true;
        }
    }

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 && year > 0 || year % 400 == 0 && year > 0;
    }

    public static String formatDate(int day, int month, int year) {
        return day + "." + month + "." + year;
    }

    public static String nextDay(int day, int month, int year) {
        String format;
        if (isValidDate(day, month, year)) {

            String s = "Next day: ";
            String formatNextDay = s + formatDate(day + 1, month, year);
            String formatNextMonth = s + formatDate(1, month + 1, year);
            String formatNextYear = s + formatDate(1, 1, year + 1);

            if (month == 2) {
                if (isLeapYear(year) && day == 29) {
                    format = formatNextMonth;
                } else if (!isLeapYear(year) && day == 28) {
                    format = formatNextMonth;
                } else {
                    format = formatNextDay;
                }
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                if (day == 30) {
                    format = formatNextMonth;
                } else {
                    format = formatNextDay;
                }
            } else if (month == 12) {
                if (day == 31) {

                    format = formatNextYear;
                } else {
                    format = formatNextDay;
                }
            } else {
                if (day == 31) {
                    format = formatNextMonth;
                } else {
                    format = formatNextDay;
                }
            }
        } else {
            format = "Wrong date";
        }
        return format;
    }
}
