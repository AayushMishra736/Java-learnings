package org.multithreading;

class Mythread extends Thread{
    public void run(){
        System.out.println("Thread is running....");
    }
}

public class Shutdownhookexample {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        r.addShutdownHook(new Mythread());

        System.out.println("Now thread is sleeping...");
        try{
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
