package org.collection.Collectionclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collectionclassexample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        System.out.println(list);
        List<String> list2 = new ArrayList<>();
        list2.add("G");
        list2.add("H");
        list.addAll(list2);
        System.out.println(list);
        System.out.println(Collections.binarySearch(list,"C"));
        System.out.println(Collections.emptyList());
        Collections.reverse(list);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.swap(list,2,6);
        System.out.println(list);
    }
}
