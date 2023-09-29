package org.collection.Treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class Treesetexample {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("mango");
        treeSet.add("apple");
        treeSet.add("orange");
        treeSet.add("pineapple");
        treeSet.add("banana");
        Iterator<String> itr = treeSet.iterator();
        while(itr.hasNext()){
            System.out.println("Value of treeset is : " + itr.next());
        }

        System.out.println("-------------------Value of descending order-----------------------");

        Iterator<String> desItr = treeSet.descendingIterator();
        while(desItr.hasNext()){
            System.out.println("Value of descending order : " + desItr.next());
        }

        System.out.println("Lowest value : " + treeSet.pollFirst());
        System.out.println("highest value : " + treeSet.pollLast());

        System.out.println("Head set value : " + treeSet.headSet("mango",true));
        //System.out.println("highest value : " + treeSet.subSet("mango",false,"apple",true));

        System.out.println("Tail set : " + treeSet.tailSet("mango",false));
    }
}
