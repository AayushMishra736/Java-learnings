package org.Java8.ObjectCloneing;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class Failsafeiterator {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer,String> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put(1,"John");
        concurrentHashMap.put(2,"Tony");
        concurrentHashMap.put(3,"Hulk");
        concurrentHashMap.put(4,"Ironman");

        //fail safe iterator
        Iterator<Integer> itr = concurrentHashMap.keySet().iterator();
        while (itr.hasNext()){
            int key = itr.next();
            System.out.println(key + " " + concurrentHashMap.get(key));
            concurrentHashMap.put(5,"Captain");
        }

        System.out.println("----------Fail fast itertaor example.---------------");
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
