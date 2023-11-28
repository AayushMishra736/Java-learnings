package org.Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class MyConsumer implements Consumer<Integer>{
    @Override
    public void accept(Integer integer) {
        System.out.println("Consumer run time : " + integer);
    }
}


public class IteratorforEachImplementation {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        MyConsumer consumer = new MyConsumer();
        list.forEach(consumer);

        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println("This is another method for traversing " + integer);
            }
        });

    }
}
