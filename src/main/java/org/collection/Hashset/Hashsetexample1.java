package org.collection.Hashset;

import java.util.HashSet;
import java.util.Iterator;

public class Hashsetexample1 {

    public static void main(String[] args) {
        HashSet<String> data = new HashSet<>();
        data.add("a");
        data.add("d");
        data.add("a");
        data.add("c");
        data.add("a");
        data.add("c");
        data.add("a");
        data.add("b");

        Iterator<String> itr = data.iterator();
        while(itr.hasNext()){
            System.out.println("Value is " + itr.next());
        }
    }

}
