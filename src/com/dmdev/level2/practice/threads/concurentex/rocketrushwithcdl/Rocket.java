package com.dmdev.level2.practice.threads.concurentex.rocketrushwithcdl;

import java.util.concurrent.CountDownLatch;

public class Rocket implements Runnable{

    private final CountDownLatch countDownLatch;

    public Rocket(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        System.out.println("Rocket await start");
        try {
            countDownLatch.await();
            System.out.println("START!!!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
