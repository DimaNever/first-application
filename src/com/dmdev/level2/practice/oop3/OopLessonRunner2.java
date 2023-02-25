package com.dmdev.level2.practice.oop3;

public class OopLessonRunner2 {
    public static void main(String[] args) {
        Computer laptop = new Laptop(new Ssd(250), new Ram(1024), 2);
        Computer mobile = new Mobile(new Ssd(125), new Ram(512));

       // print(laptop, mobile);
    }

    public static void print(Printable... obj){
        for (Printable printable : obj) {
            printable.print();
        }
    }
}
