package org.collection.Treeset;

import java.util.PriorityQueue;

class Book implements Comparable<Book> {
    int book_id;
    String book_Name;
    int book_Pages;

    public Book(int book_id, String book_Name, int book_Pages) {
        this.book_id = book_id;
        this.book_Name = book_Name;
        this.book_Pages = book_Pages;
    }

    public int compareTo(Book b) {
        if (book_Pages > b.book_Pages) {
            return 1;
        } else if (book_Pages < b.book_Pages) {
            return -1;
        } else {
            return 0;
        }
    }

}

public class Objectsinpriorityqueue {
    public static void main(String[] args) {
        Book b1 = new Book(101, "book1", 213);
        Book b2 = new Book(102, "book2", 204);
        Book b3 = new Book(103, "book3", 225);
        Book b4 = new Book(104, "book4", 206);

        PriorityQueue<Book> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(b1);
        priorityQueue.add(b2);
        priorityQueue.add(b3);
        priorityQueue.add(b4);

        for (Book b : priorityQueue) {
            System.out.println(b.book_id + " " + b.book_Name + " " + b.book_Pages);
        }
    }
}
