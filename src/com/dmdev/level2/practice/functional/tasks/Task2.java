package com.dmdev.level2.practice.functional.tasks;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 2. Дан список строк. Найти количество уникальных
 * строк длиной более 8 символов.
 */
public class Task2 {

    public static void main(String[] args) {
        List<String> stringList = List.of(
                "string-1",
                "string-2",
                "string-3",
                "string-4",
                "string-10",
                "string-10",
                "string-10",
                "string-12",
                "string-16",
                "string-14"
        );
        stringList.stream()
                .filter(str -> str.length() > 8)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        int size = stringList.stream()
                .filter(str -> str.length() > 8)
                .collect(Collectors.toSet())
                .size();
        System.out.println(size);

        long count = stringList.stream()
                .filter(str -> str.length() > 8)
                .distinct()
                .count();
        System.out.println(count);

        stringList.stream()
                .filter(str -> str.length() > 8)
                .distinct()
                .forEach(System.out::println);
    }
}
