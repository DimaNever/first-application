package com.dmdev.level2.practice.functional.tasks.task5;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;

/**
 * . Дан класс Person с полями firstName, lastName,
 * age.
 * Вывести полное имя самого старшего человека, у
 * которого длина этого имени не превышает 15
 * символов.
 */
public class Task5 {

    public static void main(String[] args) {


        List<Person> persons = List.of(
                new Person("Ivan", "Ivanov", 20),
                new Person("Petr", "Petrov", 25),
                new Person("Sveta", "Svetikova", 33),
                new Person("Kate", "Ivanova", 25),
                new Person("Slava", "Slavikov", 18),
                new Person("Arni", "Kutuzov12345", 56)
        );

        persons.stream()
                .filter(person -> person.getFullName().length() < 15)
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getFullName)
                .ifPresent(System.out::println);

        Map<Integer, List<Person>> map = persons.stream()
                .collect(groupingBy(Person::getAge));

        Map<Integer, List<Person>> mp = new TreeMap<>(map);

        System.out.println(map);
        System.out.println(mp);

        Map<Integer, List<String>> map2 = persons.stream()
                .collect(groupingBy(Person::getAge,
                        mapping(Person::getFullName, toList())));
        System.out.println(map2);

//        Map<Integer, Person> personMap = persons.stream()
//                .collect(toMap(Person::getAge, Function.identity()));
//        System.out.println(personMap);


    }
}
