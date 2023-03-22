package com.dmdev.level2.practice.collections.practice;

import java.util.ArrayList;
import java.util.List;

public class Task1 {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 3, 6, 8, 9, 13, 20);
        List<Integer> result = removeEven(list);
        System.out.println(result);
    }

    private static List<Integer> removeEven(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        for (Integer integer : list) {
            if (integer % 2 != 0) {
                result.add(integer);
            }
        }
        return result;
    }
}
