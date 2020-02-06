package com.ssafy;

public class Magazine{
	private String isbn;
	private String title;
	private String author;
	private String publisher;
	private int price;
	private String desc;
	private int year;
	private int month;
	
	public Magazine() {}

	public Magazine(String isbn, String title, String author, String publisher, int price, String desc, int year,
			int month) {
		
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.desc = desc;
		this.year = year;
		this.month = month;
	}
	
	public String toString() {
		return (isbn + "\t|" + title + "\t|" + author + "\t|" + publisher
				+ "\t|" + price + "\t|" + desc+ "\t|"+year + "." + month);
	}
	
}