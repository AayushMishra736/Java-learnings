package org.collection.Arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Arraylistexample1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Cat");
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        System.out.println("Arraylist data is :" + list);
        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println("While iterating over array data is : " + itr.next());
        }
        ListIterator<String> listiterator = list.listIterator();
        while (listiterator.hasNext()){
            System.out.println("While iterating over list array " + listiterator.next());
        }

        while (listiterator.hasPrevious()){
            System.out.println("While iterating over list in reverse direction " + listiterator.previous());
        }
    }
}
