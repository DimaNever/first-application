package com.dmdev.level2.practice.threads.atomic;

public class Counter {

    private int count;

    public void increment() {
        synchronized (this) {
            count++;
        }
    }

    public synchronized void decrement() {
        count--;
    }

    public int getCount() {
        return count;
    }
}
