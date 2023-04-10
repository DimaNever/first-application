package treg.multithreading;

import java.util.concurrent.Semaphore;

public class SemaphoreEx {

    public static void main(String[] args) {
        Semaphore callbox = new Semaphore(2);

        new Person("Ivan", callbox);
        new Person("Oleg", callbox);
        new Person("Irina", callbox);
        new Person("Victor", callbox);
        new Person("Marina", callbox);

    }
}

class Person extends Thread{
    String name;
    private Semaphore semaphore;

    public Person(String name, Semaphore semaphore) {
        this.name = name;
        this.semaphore = semaphore;
        this.start();
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " wait...");
            semaphore.acquire();
            System.out.println(name + " in callbox");
            sleep(2000);
            System.out.println(name + " ends call");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            semaphore.release();
        }
    }
}