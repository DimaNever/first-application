package com.dmdev.datetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Даны два объекта LocalDate из предыдущего задания. Подсчитать количество
 * секунд между полуночью первой даты и полуночью второй даты.
 */
public class Task6 {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate prevDate = LocalDate.of(2018, 7, 7);

//        LocalDateTime.of(now , LocalTime.MIDNIGHT);
        LocalDateTime localDateTime = now.atStartOfDay();
        LocalDateTime localDatePrev = prevDate.atStartOfDay();

        Duration duration = Duration.between(localDatePrev, localDateTime);
        System.out.println(duration.getSeconds());


    }
}
