package org.isbn.bk;

import java.util.Date;

public class Book {

public Book() {
		
	}

public Book(int bookId, String bookName, String author, double price, Date published, String isbnNo) {
	
	this.bookId = bookId;
	this.bookName = bookName;
	this.author = author;
	this.price = price;
	this.published = published;
	this.isbnNo = isbnNo;
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
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getPublished() {
		return published;
	}
	public void setPublished(Date published) {
		this.published = published;
	}
	public String getIsbnNo() {
		return isbnNo;
	}
	public void setIsbnNo(String isbnNo) {
		this.isbnNo = isbnNo;
	}
private int bookId;
private String bookName;
private String author;
private double price;
private Date published;
private String isbnNo;

}
