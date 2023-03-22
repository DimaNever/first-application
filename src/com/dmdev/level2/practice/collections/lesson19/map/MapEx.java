package com.dmdev.level2.practice.collections.lesson19.map;

import com.dmdev.level2.practice.collections.lesson19.person.Person;

import java.util.HashMap;
import java.util.Map;

public class MapEx {

    public static void main(String[] args) {
        Person ivan = new Person(1, "Ivan", "Ivanov");
        Person petr = new Person(2, "Petr", "Petrov");
        Person sveta = new Person(1, "Sveta", "Svetikova");

        Map<Integer, Person> map = new HashMap<>();
        map.put(ivan.getId(), ivan);
        map.put(petr.getId(), petr);
        map.putIfAbsent(sveta.getId(), sveta);

//        System.out.println(map.keySet());
//        System.out.println(map.values());
//        System.out.println(map.entrySet());
//
//        for (Person person : map.values()) {
//            System.out.println(person.getFirstName());
//        }

        for (Map.Entry<Integer, Person> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println(map.containsKey(2));
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.getOrDefault(2, sveta));


    }
}
