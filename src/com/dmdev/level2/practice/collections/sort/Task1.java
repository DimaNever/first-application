package com.dmdev.level2.practice.collections.sort;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Написать метод markLength4, принимающий в качестве параметра список (List) строк и размещающий строку "****"
 * перед каждым четырёхсимвольным элементом. Оригинальные элементы должны остаться на месте.
 * <p>
 * Например:
 * {"this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"}
 * ->
 * {"****", "this", "is", "****", "lots", "of", "fun", "for", "every", "****", "Java", "programmer"}
 */
public class Task1 {

    public static void main(String[] args) {
        List<String> strings = new LinkedList<>(List.of("this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"));
        List<String> strings3 = new LinkedList<>(Arrays.asList("this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"));

//        System.out.println(strings);
//        markLength4(strings);
//        System.out.println(strings);
//
//        Collections.sort(strings);
//        System.out.println(strings);
        System.out.println(strings3);
        markLength4(strings3);


    }


    public static void markLength4(List<String> stringList) {
        ListIterator<String> listIterator = stringList.listIterator();
        while (listIterator.hasNext()){
            String nextString = listIterator.next();
            if (nextString.length() == 4){
                listIterator.set("*****");
                listIterator.add(nextString);
            }
        }
        System.out.println(stringList);
    }


}
