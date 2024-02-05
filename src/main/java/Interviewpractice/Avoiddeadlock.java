package Interviewpractice;

import org.multithreading.ThreadJoinMethod;

public class Avoiddeadlock {
    class resource1 {
        int i = 10;

        public int getI() {
            return i;
        }

        public void setI(int i) {
            this.i = i;
        }
    }

    class resource2 {
        int j = 20;

        public int getJ() {
            return j;
        }

        public void setJ(int j) {
            this.j = j;
        }
    }

    public static void main(String[] args) {
        Avoiddeadlock test = new Avoiddeadlock();
        final resource1 r1 = test.new resource1();
        final resource2 r2 = test.new resource2();

        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                synchronized (r2) {
                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    synchronized (r1) {
                        System.out.println("Thread one : " + r1);
                    }
                }
            }
        };

        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                synchronized (r2) {
                    System.out.println("Thread two : " + r2);
                    synchronized (r1) {
                        System.out.println("Thread two : " + r1);
                    }
                }
            }
        };

        new Thread(runnable1).start();
        new Thread(runnable2).start();


    }
}
