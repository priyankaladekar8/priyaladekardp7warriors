package com.hashmap;

public class Book {
	
	private int bid;
	private String bname;
	private double price;
	private Author author;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Book(int bid, String bname, double price, Author author) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.price = price;
		this.author = author;
	}
	
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + ", price=" + price + ", author=" + author + "]";
	}
	
	

}
