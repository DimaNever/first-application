package com.dmdev.level2.practice.collections.sort.task2;

public class Student {
    private String name;
    private String surname;
    private int age;
    private double averageGrade;

    public Student(String name, String surname, int age, double averageGrade) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.averageGrade = averageGrade;
    }

    public String fullName(){
        return getName() + " " + getSurname();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", averageGrade=" + averageGrade +
                '}';
    }
}
