package org.multithreading.threadgroup;

public class Firstexamplethreadgroup extends Thread {
    public void run(){
        System.out.println("Thread is running...." + Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        Firstexamplethreadgroup runnable = new Firstexamplethreadgroup();
        ThreadGroup t1 = new ThreadGroup("Group A");
        Thread a1 = new Thread(t1,runnable,"Thraed 1");
        Thread a2 = new Thread(t1,runnable,"Thraed 2");
        Thread a3 = new Thread(t1,runnable,"Thraed 3");

        a1.start();
        a2.start();
        a3.start();

        System.out.println("Thread group name " + t1.getName());

        t1.list();
    }
}
