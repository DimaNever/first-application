package com.dmdev.datetime;

import java.time.LocalDateTime;

/**
 * 1. Создать объект LocalDateTime, представляющий собой
 * дату 25.06.2020 19:47. Используя этот объект, создать другой объект LocalDateTime,
 * представляющий собой дату через 3 месяца после сегодняшней.
 * Вывести на консоль содержащиеся в нем объеты LocalDate and LocalTime.
 */
public class Task1 {
    public static void main(String[] args) {

        LocalDateTime localDateTime =LocalDateTime.now();
        LocalDateTime plusMonths = localDateTime.plusMonths(3L);
        System.out.println(localDateTime);
        System.out.println(plusMonths);

        System.out.println(plusMonths.toLocalDate());
        System.out.println(plusMonths.toLocalTime());

    }
}
