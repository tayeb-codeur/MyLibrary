package be.icc.poo.data;

import java.awt.print.Book;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

public class Person {
	protected UUID id;
	private String name;
	private byte maxBooks;
	private LocalDate registrationDate;
	private ArrayList<Book>books;
	
	public Person(UUID id, String name) {
		this.id = id;
		this.name =name;
		this.maxBooks = 3;
		this.registrationDate = LocalDate.now();
		this.books = new ArrayList<Book>();
	}

	public void setId(UUID id) {
		this.id = id;
	}
	public UUID getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void setMaxBooks(byte maxBooks) {
		this.maxBooks = maxBooks;
	}

	public byte getMaxBooks() {
		return maxBooks;
	}

	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}

	public LocalDate getRegistrationDate() {
		return registrationDate;
	}

	
	public ArrayList<Books> getBooks() {
		return books;
	}

	@Override
	public String toString() {
		final int maxLen = 3;
		return "Person [" + id + " : " + name + ", (maxBooks=" + maxBooks + ",inscrit le" + registrationDate + ")\n books"
				+ (books !=null ? books.subList(0, Math.min(books.size(), maxLen)) : null) + "]";
	}

	public void setBooks(ArrayList<Books> books) {
		this.books = books;
	}


	public static void main(String[] args) {
		
		
		}
}
