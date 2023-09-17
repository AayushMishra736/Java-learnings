package org.multithreading.deadlock;

class Interruptingwithoutcause extends Thread{
    public void run() {
        try {
            Thread.sleep(200);
            System.out.println("Thread is running...");
        }
        catch (InterruptedException e){
            System.out.println("Thread is running.." + e);
        }
    }
}

public class Interruptingwithoutanycause {
    public static void main(String[] args) {
        Interruptingwithoutcause interruptingwithoutcause = new Interruptingwithoutcause();
        interruptingwithoutcause.start();
        interruptingwithoutcause.interrupt();
    }
}
