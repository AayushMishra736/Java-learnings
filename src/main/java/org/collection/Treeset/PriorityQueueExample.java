package org.collection.Treeset;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("a");
        priorityQueue.add("c");
        priorityQueue.add("d");
        priorityQueue.add("b");
        priorityQueue.add("f");

        Iterator<String> itr = priorityQueue.iterator();

        while(itr.hasNext()){
            System.out.println("PriorityQueue -- " + itr.next());
        }

        priorityQueue.remove();
        System.out.println(priorityQueue);

        priorityQueue.poll();
        System.out.println(priorityQueue);

        priorityQueue.element();
        System.out.println(priorityQueue);
    }
}
