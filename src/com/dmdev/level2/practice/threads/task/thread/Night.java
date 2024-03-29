package com.dmdev.level2.practice.threads.task.thread;

import com.dmdev.level2.practice.threads.task.util.NightConst;

public class Night extends Thread {

    private final Object lock = new Object();

    @Override
    public void run() {

        for (int i = 0; i < NightConst.AMOUNT_OF_NIGHT; i++) {
            synchronized (lock) {
                try {
                    System.out.printf("----------------\nNight %s started\n", (i + 1));
                    lock.notifyAll();
                    lock.wait(NightConst.NIGHT_INTERVAL);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        synchronized (lock) {
            lock.notifyAll();
        }
        
    }

    public Object getLock() {
        return lock;
    }
}