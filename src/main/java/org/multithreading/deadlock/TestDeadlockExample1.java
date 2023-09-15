package org.multithreading.deadlock;

public class TestDeadlockExample1 {
    public static void main(String[] args) {

        final String firstName = "Aayush";
        final String lastname = "Mishra";

        Thread t1 = new Thread(){
            public void run() {
                synchronized (firstName) {
                    System.out.println("Lock 1 : resource firstName");
                }
                
            }
        };

    }
}