package com.dmdev.level2.practice.threads.concurentex.rocketrushwithcdl;

import java.util.concurrent.CountDownLatch;

public class RocketDetailRunnable implements Runnable{

    private final CountDownLatch countDownLatch;
    private final RocketDetail rocketDetail;

    public RocketDetailRunnable(CountDownLatch countDownLatch, RocketDetail rocketDetail) {
        this.countDownLatch = countDownLatch;
        this.rocketDetail = rocketDetail;
    }

    @Override
    public void run() {
        System.out.println("Rocket detail await: " + rocketDetail);
        try {
            Thread.sleep(1000);
            System.out.println("Detail completed: " + rocketDetail);
            countDownLatch.countDown();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
