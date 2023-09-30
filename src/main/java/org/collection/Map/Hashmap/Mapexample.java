package org.collection.Map.Hashmap;

import java.util.HashMap;
import java.util.Map;

class Book implements Comparable<Book>{
    int id;
    String bookName;
    String bookAuthor;
    int page;

    public Book(int id, String bookName, String bookAuthor, int page) {
        this.id = id;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.page = page;
    }

    public int compareTo(Book b){
        if(page > b.page){
            return 1;
        }
        else if(page < b.page){
            return -1;
        }
        else{
            return 0;
        }
    }

}

public class Mapexample {
    public static void main(String[] args) {

        Book b1 = new Book(101, "Book1", "Author1", 101);
        Book b2 = new Book(103, "Book2", "Author2", 111);
        Book b3 = new Book(104, "Book3", "Author3", 121);
        Book b4 = new Book(1016, "Book4", "Author4", 131);
        Book b5 = new Book(105, "Book5", "Author5", 141);
        Book b6 = new Book(102, "Book6", "Author6", 151);

        HashMap<Integer,Book> hashMap = new HashMap<>();
        hashMap.put(1,b1);
        hashMap.put(2,b2);
        hashMap.put(3,b3);
        hashMap.put(4,b4);
        hashMap.put(5,b5);
        hashMap.put(6,b6);

        for(Map.Entry<Integer,Book> map : hashMap.entrySet()){
            int key = map.getKey();
            Book b = (Book) map.getValue();
            System.out.println("Details " + key);
            System.out.println(b.id + " " + b.bookName + " " + b.bookAuthor + " " + b.page);
        }


    }
}
