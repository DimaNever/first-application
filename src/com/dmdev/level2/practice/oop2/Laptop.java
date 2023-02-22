package com.dmdev.level2.practice.oop2;

public class Laptop extends Computer{

    private int weight;

//    {
//        System.out.println("init block laptop");
//    }
//
//    static {
//        System.out.println("static block laptop");
//    }

    public Laptop(Ssd ssd, Ram ram, int weight) {
        super();
        this.weight = weight;
    }

    public Laptop() {
        System.out.println("Constructor laptop");
    }

    public void open() {
        System.out.println("Открыл крышку");
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public void load() {

    }
}
