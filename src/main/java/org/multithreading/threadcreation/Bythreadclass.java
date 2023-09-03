package org.multithreading.threadcreation;

class Threadclassusingthread extends Thread {
    public void run() {
        System.out.println("Thread is running....");
    }
}

public class Bythreadclass {
    public static void main(String[] args) {
        Threadclassusingthread threadclassusingthread = new Threadclassusingthread();
        threadclassusingthread.start();
    }
}
