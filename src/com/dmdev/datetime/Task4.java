package com.dmdev.datetime;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

/**
 * 4. Использовать LocalDateTime из предыдущего задания, преобразовать его
 * в объект типа Instant, указав тайм зону "America/Chicago". Вывести количество
 * прошедших миллисекунд.
 */
public class Task4 {

    public static void main(String[] args) {

        String formatDate = "26-03-1968T09:24";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy'T'HH:mm");
        LocalDateTime localDateTime = LocalDateTime.parse(formatDate, dateTimeFormatter);
        System.out.println(localDateTime);

        Instant instant = localDateTime.toInstant(ZoneId.of("America/Chicago").getRules().getOffset(localDateTime));
        System.out.println(instant);
        System.out.println(instant.toEpochMilli());
        System.out.println(LocalDateTime.now().toInstant(ZoneOffset.ofHours(3)).toEpochMilli());
    }
}