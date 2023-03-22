package com.dmdev.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 3. Дана строка вида "26-03-1968T09:24". Получить объект LocalDateTime, представляющий
 * собой дату, полученную из этой строки.
 */
public class Task3 {

    public static void main(String[] args) {
        String formatDate = "26-03-1968T09:24";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy'T'HH:mm");
        LocalDateTime localDateTime = LocalDateTime.parse(formatDate, dateTimeFormatter);
        System.out.println(localDateTime);

        LocalDateTime localDateTime10 = LocalDateTime.parse("1968-03-26T09:24:11");
        System.out.println(localDateTime10);


    }
}
