package org.Java8.Methodreference;

public class Exampleofmethodreference {

    public void run(){
        System.out.println("Thread is running......");
    }

    public static void main(String[] args) {
        Thread th = new Thread();
        th.start();

    }
}
