package com.dmdev.level2.practice.oop3;

public class Ram {
    private int value;

    public Ram(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Ram{" +
                "value=" + value +
                '}';
    }
}
