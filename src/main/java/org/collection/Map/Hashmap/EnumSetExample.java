package org.collection.Map.Hashmap;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

enum days{
    SUN,MON,TUE,WED,THU,FRI,SAT
        }

public class EnumSetExample {
    public static void main(String[] args) {
        Set<days> set = EnumSet.of(days.MON,days.TUE,days.SAT);

        Iterator<days> iter = set.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        Set<days> data = EnumSet.allOf(days.class);

        System.out.println(data);

        Set<days> setNoneOf = EnumSet.noneOf(days.class);

        System.out.println(setNoneOf);

    }
}
