package treg.multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerEx {
//    static int counter = 0;
    static AtomicInteger counter = new AtomicInteger(0);
    
    public static void increment(){
//        counter++;
//        counter.incrementAndGet();
        counter.addAndGet(5);
    }


    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyRunnableImplemen());
        Thread thread2 = new Thread(new MyRunnableImplemen());
        thread2.start();
        thread1.start();
        thread1.join();
        thread2.join();

        System.out.println(counter);
    }
}

class MyRunnableImplemen implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            AtomicIntegerEx.increment();
        }
    }
}