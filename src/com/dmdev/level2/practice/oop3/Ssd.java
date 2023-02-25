package com.dmdev.level2.practice.oop3;

public class Ssd {

    private int value;

    public Ssd(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Ssd{" +
                "value=" + value +
                '}';
    }
}
