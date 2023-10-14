package org.Java8.Lambdaexpression;

public class Lambdaexpressionforthread {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread is running....");
            }
        };
        Thread t = new Thread(r);
        t.start();

        Runnable r2 = ()->{
            System.out.println("Thread is running by lambda expression...");
        };
        Thread t2 = new Thread(r2);
        t2.start();

    }
}
