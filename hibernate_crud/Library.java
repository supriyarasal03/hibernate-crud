package com.Entity_demo;

import org.hibernate.annotations.Generated;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="book_store")
public class Library {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int book_no;
	String name;
	String author;
	double price;
	String publication;
	public int getBook_no() {
		return book_no;
	}
	public void setBook_no(int book_no) {
		this.book_no = book_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getPublication() {
		return publication;
	}
	public void setPublication(String publication) {
		this.publication = publication;
	}
	public Library(int book_no, String name, String author, double price, String publication) {
		super();
		this.book_no = book_no;
		this.name = name;
		this.author = author;
		this.price = price;
		this.publication = publication;
	}
	public Library() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Library [book_no=" + book_no + ", name=" + name + ", author=" + author + ", price=" + price
				+ ", publication=" + publication + "]";
	}
	
	
	
	
	
	
	
	

}
