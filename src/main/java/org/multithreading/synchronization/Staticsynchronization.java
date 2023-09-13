package org.multithreading.synchronization;

class Staticsynchronizationthread extends Thread{
synchronized static void printTable(int x){
    for(int i  = 0;i < 10;i++){
        System.out.println(i * x);
    }
}
}

public class Staticsynchronization {
}
