package org.multithreading;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

public class Example4 implements Callable<String> {
    public static void main(String[] args) {
        ExecutorService exe = Executors.newFixedThreadPool(5);
        Callable<String> callable = new Example4();
        List<Future<String>> mylist = new ArrayList<Future<String>>();
        for(int i=0; i< 50; i++){
            Future<String> store = exe.submit(callable);
            mylist.add(store);
        }
        for(Future<String> i: mylist){
            try {
                System.out.println(new Date()+ "::"+i.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        exe.shutdown();
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(500);
        return Thread.currentThread().getName();
    }
}
