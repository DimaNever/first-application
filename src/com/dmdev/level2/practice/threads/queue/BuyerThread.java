package com.dmdev.level2.practice.threads.queue;

import java.util.concurrent.BlockingQueue;

public class BuyerThread implements Runnable {

    private final BlockingQueue<Cashbox> cashboxes;

    public BuyerThread(BlockingQueue<Cashbox> cashboxes) {
        this.cashboxes = cashboxes;
    }

    @Override
    public void run() {
        try {
            Cashbox cashbox = cashboxes.take();
            Thread.sleep(5);
            System.out.println(Thread.currentThread().getName() + " обслуживается в кассе: " + cashbox);
            cashboxes.add(cashbox);
            System.out.println(Thread.currentThread().getName() + " освобождаю кассу: " + cashbox);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        try {
//            synchronized (cashboxes) {
//                while (true) {
//                    if (!cashboxes.isEmpty()) {
//                        Cashbox cashbox = cashboxes.remove();
//                        System.out.println(Thread.currentThread().getName() + " обслуживается в кассе: " + cashbox);
//
//                        cashboxes.wait(5L);
//
//                        System.out.println(Thread.currentThread().getName() + " освобождаю кассу: " + cashbox);
//                        cashboxes.add(cashbox);
//                        cashboxes.notifyAll();
//                        break;
//                    } else {
//                        System.out.println(Thread.currentThread().getName() + " ожидает свободную кассу");
//                        cashboxes.wait();
//                    }
//                }
//            }
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}


