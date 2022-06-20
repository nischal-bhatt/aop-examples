package nischal.bhatt.methodinterceptorexample.Library;

import nischal.bhatt.methodinterceptorexample.Book.Book;

public class Library {

	private Book book;

	
	
	public Library() {
		super();
	}

	public Library(Book book) {
		
		this.book = book;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "Library [book=" + book + "]";
	}
	
	
	
}
