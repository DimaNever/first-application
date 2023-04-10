package com.dmdev.hz.deadlockex;

public class Test {
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {

            TreadEx1 treadEx1 = new TreadEx1();
            TreadEx2 treadEx2 = new TreadEx2();
            treadEx1.start();
            treadEx2.start();

    }
}

class TreadEx1 extends Thread {
    @Override
    public void run() {
        System.out.println("TreadEx1: поытка захвата lock1");
        synchronized (Test.lock1) {
            System.out.println("TreadEx1: lock1 захвачен");
            System.out.println("TreadEx1: поытка захвата lock2");
            for (int i = 0; i < 10000; i++) {
            }
            synchronized (Test.lock2) {
                System.out.println("lock1 и lock2 захвачены");
            }
        }
    }
}

class TreadEx2 extends Thread {
    @Override
    public void run() {
        System.out.println("TreadEx2: поытка захвата lock2");
        synchronized (Test.lock2) {
            System.out.println("TreadEx2: lock2 захвачен");
            System.out.println("TreadEx2: поытка захвата lock1");
            for (int i = 0; i < 10000; i++) {
            }
            synchronized (Test.lock1) {
                System.out.println("lock1 и lock2 захвачены");
            }
        }
    }
}

