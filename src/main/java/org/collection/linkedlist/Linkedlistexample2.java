package org.collection.linkedlist;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class Book{
    int book_id;
    String book_name;
    String book_publisher;
    String book_page;

    public Book(int book_id,String book_name,String book_publisher,String book_page){
        this.book_id = book_id;
        this.book_name = book_name;
        this.book_publisher = book_publisher;
        this.book_page = book_page;
    }
}
public class Linkedlistexample2 {
    public static void main(String[] args) {

        Book b1 = new Book(101,"book1","publisher1","201");
        Book b2 = new Book(102,"book2","publisher2","202");
        Book b3 = new Book(103,"book3","publisher3","203");
        Book b4 = new Book(104,"book4","publisher4","204");

        List<Book> list = new LinkedList<>();
        list.add(b1);
        list.add(b2);
        list.add(b3);
        list.add(b4);

        for(Book b : list){
            System.out.println(b.book_id + " " + b.book_name + " " +b.book_publisher + " " + b.book_page);
        }


    }
}
