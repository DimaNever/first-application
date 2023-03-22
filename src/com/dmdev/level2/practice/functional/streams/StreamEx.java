package com.dmdev.level2.practice.functional.streams;

import java.util.List;

public class StreamEx {

    public static void main(String[] args) {
        List<String> stringList = List.of("11", "22", "33", "44", "55", "66", "77");
        stringList.stream()
                .map(stringValue -> stringValue + stringValue)
                .map(Integer::valueOf)
                .filter(s -> s % 2 == 0)
                //.sorted(Comparator.comparing(Integer::intValue).reversed())
                .sorted()
                // .sorted(Collections.reverseOrder())
                .forEach(System.out::println);
        System.out.println("***********************************");

        for (String str : stringList) {
            String value = str + str;
            Integer intValue = Integer.valueOf(value);
            if (intValue % 2 == 0) {
                System.out.println(intValue);
            }
        }
    }
}
