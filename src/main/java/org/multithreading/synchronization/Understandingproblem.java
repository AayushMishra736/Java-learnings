package org.multithreading.synchronization;

import javax.swing.plaf.ToolBarUI;

class Table{
    void printTable(int m){
        for(int i = 1;i < 6;i++){
            System.out.println(i*m);
        }
    }
}
class Mythread extends Thread{
    Table t1;
    public Mythread(Table t1){
        this.t1 = t1;
    }

    public void run(){
        t1.printTable(2);
    }
}

class Mythread2 extends Thread{
    Table t2;

    public Mythread2(Table t2){
        this.t2 = t2;
    }

    public void run(){
        t2.printTable(100);
    }
}

public class Understandingproblem {

    public static void main(String[] args) {
        Table t = new Table();
        Mythread m1 = new Mythread(t);
        Mythread2 m2 = new Mythread2(t);

        m1.start();
        m2.start();

    }

}
