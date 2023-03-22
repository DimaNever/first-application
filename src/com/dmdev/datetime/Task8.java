package com.dmdev.datetime;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * Написать свою реализацию интерфейса TemporalAdjuster, которая бы
 * прибавляла к дате 42 дня
 */
public class Task8 {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.plusDays(42));

        LocalDateTime localDateTime = now.with(temporal -> temporal.plus(42, ChronoUnit.DAYS));
        System.out.println(localDateTime);
    }
}
