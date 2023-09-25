package org.collection.Hashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Java");
        linkedHashSet.add("T");
        linkedHashSet.add("Point");
        linkedHashSet.add("Good");
        linkedHashSet.add("Website");
        linkedHashSet.add("Java");
        linkedHashSet.add("Total");
        linkedHashSet.add("Point");
        linkedHashSet.add("Goodfor");
        linkedHashSet.add("Website");

        Iterator<String> itr = linkedHashSet.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }

}
