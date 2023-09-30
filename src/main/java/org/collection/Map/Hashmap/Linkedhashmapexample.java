package org.collection.Map.Hashmap;

import org.collection.Hashset.LinkedHashSetExample;

import java.util.LinkedHashMap;

public class Linkedhashmapexample {

    public static void main(String[] args) {
        LinkedHashMap<Integer,String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(101,"Apple");
        linkedHashMap.put(104,"Mango");
        linkedHashMap.put(103,"Banana");
        linkedHashMap.put(102,"Orange");


        System.out.println(linkedHashMap);
    }

}
