package org.multithreading;

public class Twotaskbytwothreadexample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Firsttask());
        Thread thread2 = new Thread(new SecondTask());
        thread1.start();
        thread2.start();
    }
}

class Firsttask implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Executing firstTask  " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class SecondTask implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Executing secondTask   " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}