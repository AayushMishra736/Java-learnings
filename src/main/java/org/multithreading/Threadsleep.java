package org.multithreading;

public class Threadsleep extends Thread {

    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Executing thread " + i);
        }
    }

    public static void main(String[] args) {
        Threadsleep threadsleep = new Threadsleep();
        Threadsleep threadsleep2 = new Threadsleep();
        threadsleep.start();
        threadsleep2.start();
    }
}
