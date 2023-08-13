package org.HashmapProgram.src.com.Book;

import java.util.*;
import java.util.Map.Entry;

public class Bookhashmap {

	public static void main(String[] args) {
	HashMap<Integer,Book> hashMap = new HashMap<>();
	hashMap.put(1001, new Book(101,"The Secret","Pearson",670));
	hashMap.put(1002, new Book(102,"The Man Who Know Infinity","Penguin",970));
	hashMap.put(1003, new Book(103,"The Vinci Code","Tata McGraw Hill",1345));
	hashMap.put(1004, new Book(104,"Imitation Game","HarperCollins",342));
	hashMap.put(1005, new Book(105,"Half GirlFriend","Scholastic India",456));
	
    for(Entry m : hashMap.entrySet()) {
    Book b = (Book)m.getValue();
    System.out.println(m.getKey() + " : " + b.bookId + " : " + b.bookName + " : " +b.bookPrice + " : " + b.bookPublication);
    }
    
    System.out.println("-----------------Reduce Price By 10%-------------------");
    
    for(Entry m : hashMap.entrySet()) {
    Book b = (Book)m.getValue();
    b.setBookPrice(b.getBookPrice() - 233);
    System.out.println(m.getKey() + " : " + b.bookId + " : " + b.bookName + " : " + b.bookPrice + " : " + b.bookPublication);	
    }
    
	}

}
