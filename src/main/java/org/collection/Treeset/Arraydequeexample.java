package org.collection.Treeset;

import java.util.ArrayDeque;

public class Arraydequeexample {
    public static void main(String[] args) {
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.add("Mango");
        arrayDeque.add("Apple");
        arrayDeque.add("Banana");
        arrayDeque.add("kiwi");
        arrayDeque.add("Pineapple");
        System.out.println(arrayDeque);

        for(String s:arrayDeque){
            System.out.println(s);
        }

        arrayDeque.remove();
        System.out.println(arrayDeque);

        arrayDeque.poll();
        System.out.println(arrayDeque);

        arrayDeque.add("new fruit");
        System.out.println(arrayDeque);

        arrayDeque.element();
        System.out.println(arrayDeque);

        arrayDeque.peek();
        System.out.println(arrayDeque);



    }
}
