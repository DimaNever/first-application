package com.dmdev.level2.practice.collections.practice;

import java.util.HashSet;
import java.util.Map;

/**
 * Написать метод isUnique, который принимает Map<String, String>
 * и возвращает true,
 * если каждому ключу соответствуют свое уникальное значение.
 * Например, в данном случае вернётся true:
 * {Marty=Stepp, Stuart=Reges, Jessica=Miller, Amanda=Camp,
 * Hal=Perkins}
 * А в данном false:
 * {Kendrick=Perkins, Stuart=Reges, Jessica=Miller, Bruce=Reges,
 * Hal=Perkins}
 */
public class Task3 {

    public static void main(String[] args) {
        Map<String, String> map = Map.of(
                "Marty", "Perkins",
                "Stuart", "Reges",
                "Jessica", "Miller",
                "Amanda", "Camp",
                "Hal","Perkins"
        );
        System.out.println(isUnique(map));

    }

    public static boolean isUnique(Map<String, String> map){
       return map.size() == new HashSet<>(map.values()).size();
    }
}
