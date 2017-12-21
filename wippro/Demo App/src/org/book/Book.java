package org.book;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Book_Details")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
@DiscriminatorColumn(name="book_type",discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue("book")
public class Book {
	@OneToOne
	@JoinColumn(name="id")
	private Author author;
	
	
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	@Column(name="book_id")
	@GeneratedValue
	@Id
	int id;
	@Column(name="book_title")
	String title;
	
	@Column(name="book_price")
	double price;
	@Column(name="isbn_no")
	String isbnno;
	@Column(name="publisher")
	String publisher;
	@Column(name="edition")
	String edition;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getIsbnno() {
		return isbnno;
	}
	public void setIsbnno(String isbnno) {
		this.isbnno = isbnno;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getEdition() {
		return edition;
	}
	public void setEdition(String edition) {
		this.edition = edition;
	}	

}
