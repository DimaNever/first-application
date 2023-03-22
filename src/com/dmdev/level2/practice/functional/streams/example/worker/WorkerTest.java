package com.dmdev.level2.practice.functional.streams.example.worker;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class WorkerTest {
    public static void main(String[] args) {

        List<Worker> workers = List.of(
                new Worker("Ivan", 20, 500, "worker"),
                new Worker("Petr", 30, 1000, "manager"),
                new Worker("Aleksandr", 25, 800, "IT developer"),
                new Worker("Elena", 18, 600, "HR manager"),
                new Worker("Ekaterina", 21, 500, "worker"),
                new Worker("Ivan", 22, 550, "worker"),
                new Worker("Oleg", 28, 950, "IT developer"),
                new Worker("Pavel", 26, 750, "HR manager"),
                new Worker("Ivan", 22, 550, "analytic"),
                new Worker("Aleksandr", 35, 2500, "director")
        );


//        Map<String, List<Worker>> map = workers.stream()
//                .collect(Collectors.groupingBy(Worker::getPosition));
//        for (Map.Entry<String, List<Worker>> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue().size() + ": " + entry.getValue());
//        }
//        System.out.println("**************************************************************************");
//
//        Map<String, Set<Worker>> map1 = workers.stream()
//                .collect(Collectors.groupingBy(Worker::getPosition, Collectors.toSet()));
//        for (Map.Entry<String, Set<Worker>> entry : map1.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue().size() + ": " + entry.getValue());
//        }
//        System.out.println("--------------------------------------------------------------------------");
        System.out.println();
        Map<String, Long> map2 = workers.stream()
                .collect(Collectors.groupingBy(Worker::getPosition, Collectors.counting()));
        System.out.println(map2);
        System.out.println("--------------------------------------------------------------------------");

        Map<String, Set<String>> map3 = workers.stream()
                .collect(Collectors.groupingBy(Worker::getPosition,
                        Collectors.mapping(Worker::getName, Collectors.toSet())));
        System.out.println(map3);
        System.out.println("--------------------------------------------------------------------------");

        Map<String, Double> map4 = workers.stream()
                .collect(Collectors.groupingBy(Worker::getPosition,
                        Collectors.averagingInt(Worker::getSalary)));
        System.out.println(map4);
        System.out.println("--------------------------------------------------------------------------");

        Map<String, String> map5 = workers.stream()
                .collect(Collectors.groupingBy(Worker::getPosition,
                        Collectors.mapping(Worker::getName, Collectors.joining(", ", "{", "}"))));
        System.out.println(map5);


    }
}
