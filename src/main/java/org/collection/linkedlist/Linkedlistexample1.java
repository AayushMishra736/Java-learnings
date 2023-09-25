package org.colistection.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlistexample1 {
    public static void main(String[] args) {
        LinkedList<String> list =new LinkedList<>();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ajay");
        list.add("Anuj");
        list.add("Gaurav");
        list.add("Harsh");
        list.add("Virat");
        list.add("Gaurav");
        list.add("Harsh");
        list.add("Amit");

        list.remove(9);
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        //list.removeFirstOccurrence("Gaurav");
        System.out.println(list);
        list.removeLastOccurrence("Gaurav");
        System.out.println(list);

        Iterator i = list.descendingIterator();

        while(i.hasNext()){
            System.out.println(i.next());
        }

    }
}
