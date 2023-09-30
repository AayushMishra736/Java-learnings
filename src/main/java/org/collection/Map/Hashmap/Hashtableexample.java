package org.collection.Map.Hashmap;

import java.util.Hashtable;

public class Hashtableexample {
    public static void main(String[] args) {
        Hashtable<Integer,String> hashtable = new Hashtable<>();
        hashtable.put(1,"A");
        hashtable.put(7,"B");
        hashtable.put(3,"C");
        hashtable.put(6,"D");
        hashtable.put(5,"E");
        hashtable.put(4,"F");
        hashtable.put(2,"G");

        System.out.println(hashtable);
        System.out.println(hashtable.getOrDefault(7,"Not Found"));
        System.out.println(hashtable.getOrDefault(9,"Not Found"));
    }
}
