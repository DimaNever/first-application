package treg.multithreading;

public class WaitNotifyEx {

    public static void main(String[] args) {
        Market market = new Market();
        Producer producer = new Producer(market);
        Consumer consumer = new Consumer(market);
        Thread thread1 = new Thread(producer);
        Thread thread2 = new Thread(consumer);
        thread1.start();
        thread2.start();
    }
}

class Market {
    private int breadCount = 0;

    public synchronized void putBread() {
        System.out.println("Производитель пытается добавить хлеб");
        while (breadCount >= 5) {
            try {
                System.out.println("Производитель SLEEP");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        breadCount++;
        System.out.println("Producer add 1 bread");
        System.out.println("Numbers of bread in market = " + breadCount);
        notify();
    }

    public synchronized void getBread() {
        System.out.println("Потребитель пытается взять хлеб");
        while (breadCount < 1) {
            try {
                System.out.println("Потребитель SLEEP");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        breadCount--;
        System.out.println("Consumer buy 1 bread");
        System.out.println("Numbers of bread in market = " + breadCount);
        notify();
    }
}

class Producer implements Runnable {
    Market market;

    public Producer(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
      //      System.out.println("Производитель пытается добавить хлеб");
            market.putBread();
        }
    }
}

class Consumer implements Runnable {
    Market market;

    public Consumer(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
      //      System.out.println("Потребитель пытается взять хлеб");
            market.getBread();
        }
    }
}
