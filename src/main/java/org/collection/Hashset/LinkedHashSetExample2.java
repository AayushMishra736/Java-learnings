package org.collection.Hashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

class Book {
    int bookId;
    String bookName;
    String bookPage;
    long bookCount;

    public Book(int bookId, String bookName, String bookPage, long bookCount) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookPage = bookPage;
        this.bookCount = bookCount;
    }

}

public class LinkedHashSetExample2 {
    public static void main(String[] args) {
        Book b1 = new Book(101, "Book1", "109", 10);
        Book b2 = new Book(102, "Book2", "119", 11);
        Book b3 = new Book(103, "Book3", "129", 12);
        Book b4 = new Book(104, "Book4", "139", 13);
        Book b5 = new Book(105, "Book5", "149", 14);
        Book b6 = new Book(106, "Book6", "159", 15);

        LinkedHashSet<Book> list = new LinkedHashSet<>();
        list.add(b1);
        list.add(b2);
        list.add(b3);
        list.add(b4);
        list.add(b5);
        list.add(b6);

        Iterator<Book> itr = list.iterator();
        while(itr.hasNext())
        {
            Book book = (Book)itr.next();
            System.out.println(book.bookId + " " + book.bookName + " " + book.bookPage + " " + book.bookPage) ;
        }
    }
}
