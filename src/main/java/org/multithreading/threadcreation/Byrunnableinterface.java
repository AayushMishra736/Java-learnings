package org.multithreading.threadcreation;

class Threadclass implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread is running....");
    }
}

public class Byrunnableinterface {
    public static void main(String[] args) {
        Threadclass thread = new Threadclass();
        Thread t1 = new Thread(thread);
        t1.start();
    }
}
