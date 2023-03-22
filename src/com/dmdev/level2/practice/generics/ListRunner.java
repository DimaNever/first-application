package com.dmdev.level2.practice.generics;

public class ListRunner {

    public static void main(String[] args) {
        ListEx<String> listEx = new ListEx<>(10);
        listEx.add("String1");
        listEx.add("String2");
        listEx.add("String3");

        String element = listEx.get(1);
        System.out.println(element);
    }
}
