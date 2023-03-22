package com.dmdev.level2.practice.functional.tasks;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 4. Дан список целых чисел, вывести строку,
 * представляющую собой конкатенацию
 * строковых представлений этих чисел.
 * Пример: список {5, 2, 4, 2, 1}
 * Результирующая строка: "52421"
 */
public class Task4 {

    public static void main(String[] args) {
        List<Integer> integers = List.of(5, 2, 4, 2, 1);
        String collect = integers.stream()
                .map(String::valueOf)
                .collect(Collectors.joining("|","Pref "," Suf"));
        System.out.println(collect);
    }
}
