package org.collection.Map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Mapexample {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(104,"Europe");
        map.put(102,"Australia");
        map.put(103,"North America");
        map.put(101,"Asia");

        System.out.println("--Ascending Order By Key--");

        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

        System.out.println("--Descending Order By Key--");

        map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);

        System.out.println("--Descending Order By Value--");

        map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);

        System.out.println("--Ascending Order By Value--");

        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

    }
}
