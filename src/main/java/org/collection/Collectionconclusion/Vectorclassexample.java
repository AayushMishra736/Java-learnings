package org.collection.Collectionconclusion;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Vectorclassexample {

    public static void main(String[] args) {

        Vector<String> vec = new Vector<>();
        vec.add("Tiger");
        vec.add("Lion");
        vec.add("Dog");
        vec.add("Elephant");
        System.out.println(vec);
        vec.addElement("Rat");
        vec.addElement("Cat");
        vec.addElement("Deer");
        System.out.println(vec);
        System.out.println(vec.capacity());
        System.out.println(vec.clone());

        String[] str = new String[10];
        vec.copyInto(str);
        System.out.println(str.toString());
    }

}
