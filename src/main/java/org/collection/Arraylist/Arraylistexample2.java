package org.collection.Arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylistexample2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();//Creating arraylist
        list.add("Mango");//Adding object in arraylist
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");

        for(String str:list){
            System.out.println("Arraylist data " + str);
        }

        System.out.println("Traversing list through forEachRemaining() method:");

        Iterator<String> itr = list.iterator();
        itr.forEachRemaining(a -> System.out.println("Printing : " + a));

    }
}
