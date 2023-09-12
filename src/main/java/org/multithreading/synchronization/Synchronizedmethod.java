package org.multithreading.synchronization;

class Tablelearning{

    synchronized void printTable(int i){
        for(int j = 1;j < 6;j++){
            System.out.println(i * j);
        }
    }
}

class Thread1 extends Thread{
    Tablelearning t1;

    public Thread1(Tablelearning t1){
        this.t1 = t1;
    }

    public void run(){
       t1.printTable(3);
    }
}

class Thread2 extends Thread{
    Tablelearning t2;

    public Thread2(Tablelearning t2){
        this.t2 = t2;
    }

    public void run(){
        t2.printTable(200);
    }

}

public class Synchronizedmethod {
    public static void main(String[] args) {
        Tablelearning t = new Tablelearning();
        Thread1 t1 = new Thread1(t);
        Thread2 t2 = new Thread2(t);
        t1.start();
        t2.start();
    }
}
