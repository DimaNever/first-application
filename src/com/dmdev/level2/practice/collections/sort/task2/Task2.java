package com.dmdev.level2.practice.collections.sort.task2;

import java.util.Arrays;
import java.util.List;

/**
 * Создать класс Student, представляющий собой ученика.
 * Добавить ему данные об имени, фамилии, возрасте и среднем балле за год.
 * Создать список (List) учеников. Найти и вывести ученика с самым высоким средним баллом используя итератор.
 * Отсортировать и вывести список учеников по полному имени (имя + фамилия),
 * возрасту и среднему баллу, используя компараторы.
 */
public class Task2 {

    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("Alisa", "Neverova", 9 , 4.89),
                new Student("Nasta", "Urazova", 37 , 4.97),
                new Student("Kira", "Neverova", 6 , 4.97),
                new Student("Dima", "Petrov", 36 , 4.5)
        );

        System.out.println(BestStudent(studentList));
    }

    private static Student BestStudent(List<Student> studentList) {
        Student best = null;
        for (Student student : studentList) {
            if (best == null ||student.getAverageGrade()> best.getAverageGrade()){
                best = student;
            }

        }
        return best;
    }
}
