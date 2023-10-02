package org.collection.Collectionconclusion;

import java.util.ListIterator;
import java.util.Stack;

public class Stackclassexample {
    public static void main(String[] args) {

    Stack<String> stk = new Stack<>();
    stk.push("A");
    stk.push("B");
    stk.push("C");
    stk.push("D");
    stk.push("E");
    stk.push("F");
    stk.push("G");

    stk.forEach(n -> System.out.print(n + " "));

    ListIterator<String> listIterator = stk.listIterator();

    while(listIterator.hasNext()){
        System.out.println(listIterator.next() + " ");
    }

    }
}
