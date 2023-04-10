package treg.multithreading;

public class InterruptionEx {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main starts");
        InterruptedThread thread = new InterruptedThread();

        thread.start();
        Thread.sleep(2000);
        thread.interrupt();
        thread.join();

        System.out.println("main ends");
    }
}


class InterruptedThread extends Thread {
    double sqrtsum = 0;

    @Override
    public void run() {
        for (int i = 0; i < 1_000_000_000; i++) {
            if (isInterrupted()) {
                System.out.println("Potok xotyat prervat'");
                System.out.println(sqrtsum);
                return;
            }
            sqrtsum += Math.sqrt(i);
        }
        System.out.println(sqrtsum);
    }
}
