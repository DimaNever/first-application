package com.dmdev.level2.practice.collections.practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Сложить два многочлена заданной степени, если коэффициенты
 * многочлена хранятся в объекте HashMap в виде:
 * Ключ: номер степени
 * Значение: значение множителя
 * Вывести результирующий многочлен в виде строки: ax^6 + bx^4 +
 * cx^3 + dx + 8
 */
public class Task4 {

    public static void main(String[] args) {
        Map<Integer, Integer> polynomial1 = Map.of(
                0, 5,
                1, 3,
                3, 2,
                5, 4,
                6, 7
        );
        Map<Integer, Integer> polynomial2 = Map.of(
                0, 5,
                3, 4,
                5, 5,
                6, 1
        );
        Map<Integer, Integer> sum = sum(polynomial1, polynomial2);
        System.out.println(sum);
        System.out.println(convertToString(sum));
    }

    public static String convertToString(Map<Integer,Integer> map){
        Map<Integer,Integer> result = new TreeMap<>(Comparator.reverseOrder());
        result.putAll(map);
        List<String> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
            String str = entry.getKey() == 0
            ? String.valueOf(entry.getValue())
            : entry.getValue() + "X^" + entry.getKey();
            list.add(str);
        }
        return String.join(" + ", list);
    }

    public static Map<Integer, Integer> sum(Map<Integer, Integer> integerMap1,
                                            Map<Integer, Integer> integerMap2){
        Map<Integer, Integer> result = new HashMap<>(integerMap1);
        for (Map.Entry<Integer, Integer> entry : integerMap2.entrySet()) {
//            Integer value = result.getOrDefault(entry.getKey(), 0);
//            result.put(entry.getKey(), value + entry.getValue());
            result.merge(entry.getKey(), entry.getValue(), Integer::sum);
        }
        return result;
    }
}
