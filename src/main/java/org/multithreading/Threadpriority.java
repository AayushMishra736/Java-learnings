package org.multithreading;

public class Threadpriority extends Thread {
    public void run(){
        System.out.println("Thread is running.....");
    }
    public static void main(String[] args) {
        Threadpriority t1 = new Threadpriority();
        Threadpriority t2 = new Threadpriority();
        Threadpriority t3 = new Threadpriority();

        System.out.println("Checking the priority of first thread " + t1.getPriority());
        System.out.println("Checking the priority of second thread " + t2.getPriority());
        System.out.println("Checking the priority of third thread " + t3.getPriority());

        t1.setPriority(7);
        t2.setPriority(8);
        t3.setPriority(9);

        System.out.println("Checking the priority after setiing priority of first thread " + t1.getPriority());
        System.out.println("Checking the priority after setiing priority of second thread " + t2.getPriority());
        System.out.println("Checking the priority after setiing priority of third thread " + t3.getPriority());

        System.out.println("Checking the priority  of current thread " + Thread.currentThread().getPriority());

        Thread.currentThread().setPriority(1);

        System.out.println("Checking the priority  of current thread " + Thread.currentThread().getPriority());

    }
}
