package org.multithreading.threadcreation;

public class Byconstructor {

    public static void main(String[] args) {
        Thread thread = new Thread("Thread is running by constructor.....");
        thread.start();

        String name = thread.getName();
        System.out.println(name);
    }

}
