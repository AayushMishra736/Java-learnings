package org.multithreading.synchronization;

class Examplethread extends Thread {
    void printTable(int x) {
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                System.out.println(i * x);
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class Mythreadexample extends Thread {
    Examplethread t;

    public Mythreadexample(Examplethread t) {
        this.t = t;
    }
    public void run(){
        t.printTable(10);
    }
}

class Mythreadexmpale2 extends Thread {
    Examplethread t;

    public Mythreadexmpale2(Examplethread t){
        this.t = t;
    }

    public void run(){
        t.printTable(20);
    }
}

public class Synchronizedblock {
    public static void main(String[] args) {
        Examplethread e = new Examplethread();
        Mythreadexample t1 = new Mythreadexample(e);
        Mythreadexmpale2 t2 = new Mythreadexmpale2(e);
        t1.start();
        t2.start();

    }
}
