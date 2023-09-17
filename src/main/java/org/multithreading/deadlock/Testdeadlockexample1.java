package org.multithreading.deadlock;

public class Testdeadlockexample1 {

    public static void main(String[] args) {
        final String resource1 = "Resource - 1";
        final String resource2 = "Resource - 2";
        Thread thread1 = new Thread() {
            public void run() {
                synchronized (resource1) {
                    System.out.println("Lock 1 : Resource 1");
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (resource2) {
                        System.out.println("Lock 2 :  Resource 1");
                    }
                }
            }
        };

        Thread thread2 = new Thread() {
            public void run() {
                synchronized (resource2) {
                    System.out.println("Lock 2 : Resource 2");
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (resource1) {
                        System.out.println("Lock 2 : Resource 1");
                        try {
                            Thread.sleep(300);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        };

        thread1.start();
        thread2.start();
    }

}
