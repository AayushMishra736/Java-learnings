package org.multithreading;


class Tabletask implements Runnable{

    @Override
    public void run() {
        System.out.println("Task is running....");
    }
}
public class Example1 {
    public static void main(String[] args) {
        Tabletask tabletask = new Tabletask();
        Thread thread = new Thread(tabletask);
        thread.start();
    }
}
