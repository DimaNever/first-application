package com.dmdev.level2.practice.collections.lesson19.person;

public class PersonEx {

    public static void main(String[] args) {
        Person ivan = new Person(1, "Ivan2", "Ivanov");
        Person petr = new Person(1, "Ivan", "Ivanov2");
        //Person petr = new Person(2, "Petr", "Petrov");

        System.out.println(ivan.hashCode());
        System.out.println(petr.hashCode());
        System.out.println(ivan.equals(petr));

    }
}
