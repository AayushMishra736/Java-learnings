package org.multithreading;

public class ThreadExample2 extends Thread {

    @Override
    public void run(){
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
    ThreadExample2 threadExample2 = new ThreadExample2();
    Thread thread = new Thread(threadExample2);
    thread.start();
    }
}
