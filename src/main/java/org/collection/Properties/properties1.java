package org.collection.Properties;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class properties1 {
    public static void main(String[] args) {
        Properties p1 = System.getProperties();
        Set set = p1.entrySet();

        Iterator itr = set.iterator();

        while(itr.hasNext()){
            Map.Entry entry = (Map.Entry)itr.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
