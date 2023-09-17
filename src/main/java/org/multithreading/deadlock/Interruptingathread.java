package org.multithreading.deadlock;

class Interruptedclass extends Thread {
    public void run() {
        System.out.println("Thread is running....");
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
           throw new RuntimeException(e);
        }
    }
}

public class Interruptingathread {
    public static void main(String[] args) {
        Interruptedclass interruptedclass = new Interruptedclass();
        interruptedclass.start();
        try {
            interruptedclass.interrupt();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
