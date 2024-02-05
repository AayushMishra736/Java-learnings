package Interviewpractice;

import org.multithreading.ThreadJoinMethod;

import java.util.concurrent.ThreadLocalRandom;

public class Deadlocksituation {
    public static void main(String[] args) {
        final String resource1 = "resource1";
        final String resource2 = "resource2";

        Thread t1 = new Thread() {
            public void run() {
                synchronized (resource1) {
                    System.out.println("Thread one locking : " + resource1);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (resource2){
                        System.out.println("Thread two locking : " + resource2);
                    }
                }
            }
        };


        Thread t2 = new Thread() {
            public void run() {
                synchronized (resource2) {
                    System.out.println("Thread two locking : " + resource2);
                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    synchronized (resource1) {
                        System.out.println("Thread two locking : " + resource1);
                    }
                }
            }
        };

        t1.start();
        System.out.println("Checking state priority etc t1: " + t1.getName() + " : " + t1.getState() + " : " + t1.getPriority());
        t2.start();
        System.out.println("Checking state priority etc t2: " + t2.getName() + " : " + t2.getState() + " : " + t2.getPriority());

    }
}
