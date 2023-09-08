package org.hashmapProgram;

public class Book {
	int bookId;
	String bookName;
	String bookPublication;
	int bookPrice;
	
	
	
	public Book() {
		
	}
	public Book(int bookId, String bookName, String bookPublication, int bookPrice) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookPublication = bookPublication;
		this.bookPrice = bookPrice;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookPublication() {
		return bookPublication;
	}
	public void setBookPublication(String bookPublication) {
		this.bookPublication = bookPublication;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	
	
	
	
}
