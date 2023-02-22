package com.dmdev.level2.practice.oop2;

public class OopLessonRunner2 {

    public static void main(String[] args) {
        // Laptop -> Computer -> Object
        // Laptop <- Computer <- Object
        new Laptop();
        System.out.println();
        new Laptop();

        //Computer computer = new Computer(new Ssd(1), new Ram(2));
    }
}
