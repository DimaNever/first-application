package com.dmdev.level2.practice.threads.concurentex.rocketrushwithbarrier;

import java.util.Arrays;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class RocketStarDemo {

    public static void main(String[] args) throws InterruptedException {

        CyclicBarrier cyclicBarrier = new CyclicBarrier(RocketDetail.values().length, () -> System.out.println("START !!!"));

        ExecutorService threadPool = Executors.newCachedThreadPool();

        Arrays.stream(RocketDetail.values())
                .map(d -> new RocketDetailRunnable(cyclicBarrier,d))
                .forEach(threadPool::submit);

        threadPool.shutdown();
        threadPool.awaitTermination(55, TimeUnit.SECONDS);
    }
}


