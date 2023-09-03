package org.multithreading;

public class Daemonthreadexample extends Thread {

    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println("Thread is deamon thread and is in running state....");
        }
        else {
            System.out.println("Thread is user thread...");
        }

    }

    public static void main(String[] args) {
        Daemonthreadexample daemonthreadexample1 = new Daemonthreadexample();
        Daemonthreadexample daemonthreadexample2 = new Daemonthreadexample();
        Daemonthreadexample daemonthreadexample3 = new Daemonthreadexample();

        daemonthreadexample1.setDaemon(true);

        daemonthreadexample1.start();
        daemonthreadexample2.start();
        daemonthreadexample3.start();

    }

}
