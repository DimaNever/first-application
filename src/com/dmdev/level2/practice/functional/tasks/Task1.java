package com.dmdev.level2.practice.functional.tasks;

import java.util.List;
import java.util.OptionalDouble;

/**
 * Дан список целых чисел. Найти среднее всех
 * нечётных чисел, делящихся на 5.
 */
public class Task1 {

    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 3, 4, 6, 8, 5, 15, 20, 25, 10);
//        ist<Integer> integers = List.of(1, 3, 4, 6, 8, 20,  10);
        double averageDouble = integers.stream()
                .filter(it -> it % 2 != 0 && it % 5 == 0)
                .mapToInt(Integer::intValue)
                .summaryStatistics()
                .getAverage(); // возвращает сразу дабл. Почему?
        System.out.println("it's double " + averageDouble);

        OptionalDouble average = integers.stream()
                .filter(it -> it % 2 != 0 && it % 5 == 0)
                .mapToInt(Integer::intValue)
                .average();
        average.ifPresent(System.out::println);
    }
}
