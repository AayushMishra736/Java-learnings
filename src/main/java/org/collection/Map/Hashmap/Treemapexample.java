package org.collection.Map.Hashmap;

import java.util.NavigableSet;
import java.util.TreeMap;

public class Treemapexample {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(1,"A");
        treeMap.put(7,"B");
        treeMap.put(3,"C");
        treeMap.put(6,"D");
        treeMap.put(5,"E");
        treeMap.put(4,"F");
        treeMap.put(2,"G");

        System.out.println(treeMap);
        System.out.println(treeMap.ceilingEntry(3));
        System.out.println(treeMap.ceilingKey(3));

        NavigableSet<Integer> navigableSet = treeMap.descendingKeySet();
    }
}
