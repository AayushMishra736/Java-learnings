package org.multithreading;

public class ThreadJoinMethod extends Thread{

    public void run(){
        for(int i = 1;i < 5;i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread : " + i);
        }
    }

    public static void main(String[] args) {
        ThreadJoinMethod th = new ThreadJoinMethod();
        ThreadJoinMethod th2 = new ThreadJoinMethod();
        ThreadJoinMethod th3 = new ThreadJoinMethod();
        th.start();
        try{
          th.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        th2.start();
        th3.start();
    }
}
