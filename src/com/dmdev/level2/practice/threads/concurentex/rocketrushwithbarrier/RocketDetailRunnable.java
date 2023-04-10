package com.dmdev.level2.practice.threads.concurentex.rocketrushwithbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class RocketDetailRunnable implements Runnable{

    private final CyclicBarrier cyclicBarrier;
    private final RocketDetail rocketDetail;

    public RocketDetailRunnable(CyclicBarrier cyclicBarrier, RocketDetail rocketDetail) {
        this.cyclicBarrier = cyclicBarrier;
        this.rocketDetail = rocketDetail;
    }

    @Override
    public void run() {
        System.out.println("Rocket detail await: " + rocketDetail);
        try {
            Thread.sleep(1000);
            System.out.println("Detail completed and waiting: " + rocketDetail);
            cyclicBarrier.await();
            System.out.println("Detail used" + rocketDetail);
        } catch (InterruptedException | BrokenBarrierException e) {
            throw new RuntimeException(e);
        }
    }
}
