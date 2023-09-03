package org.multithreading;

class Threadjoin extends Thread{
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(5000);
                System.out.println("Current thread name " +  Thread.currentThread().getName());
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("Number of thread is " + i);
        }
    }
}
public class Threadexampleforjoinmethod {
    public static void main(String[] args) {
        Threadjoin threadjoin1 = new Threadjoin();
        Threadjoin threadjoin2 = new Threadjoin();
        Threadjoin threadjoin3 = new Threadjoin();

        threadjoin1.start();
        try{
            System.out.println("Trying to get current thread name " + Thread.currentThread().getName());
            threadjoin1.join();
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }

        threadjoin2.start();
        try{
            System.out.println("Trying to get current thread name " + Thread.currentThread().getName());
            threadjoin2.join();
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        threadjoin3.start();
    }
}
