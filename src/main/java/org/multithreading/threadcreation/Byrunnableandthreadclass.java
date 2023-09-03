package org.multithreading.threadcreation;

public class Byrunnableandthreadclass implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread is running....");
    }

    public static void main(String[] args) {
        Runnable inter = new Byrunnableandthreadclass();
        Thread thread = new Thread(inter,"Invoking thread...");
        thread.start();

        String threadName = thread.getName();

        System.out.println(threadName);
    }

}
