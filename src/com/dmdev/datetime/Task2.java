package com.dmdev.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 2. Создать объект LocalDate, представляющий собой сегодняшнюю
 * дату. Преобразовать дату в строку вида "05.05.2017". Вывести эту строку на
 * консоль.
 */
public class Task2 {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd:MM:yy - G * EEEE");

        System.out.println(now);
        System.out.println(now.format(dateTimeFormatter));
    }
}
