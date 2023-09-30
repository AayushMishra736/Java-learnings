package org.collection.Map.Hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashmapExample1 {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(101,"A");
        map.put(102,"B");
        map.put(103,"C");
        map.put(104,"D");
        map.put(105,"E");

        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }

        map.putIfAbsent(106,"F");

        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }

        map.remove(104);
        System.out.println(map);

        map.replace(101,"A","John");

        System.out.println(map);

    }
}
