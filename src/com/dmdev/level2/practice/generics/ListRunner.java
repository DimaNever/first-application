package com.dmdev.level2.practice.generics;

import com.dmdev.level2.practice.oop2.Laptop;

public class ListRunner {

    public static void main(String[] args) {
        List<String> list = new List<>(10);
        list.add("String1");
        list.add("String2");
        list.add("String3");

        String element = list.get(1);
        System.out.println(element);
    }
}