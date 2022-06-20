package nischal.bhatt.methodinterceptorexample.Book;

public class Book {

	private String title;
	private String author;
	private String publications;

	
	
	public Book() {
		super();
	}

	public Book(String title, String author, String publications) {
		super();
		this.title = title;
		this.author = author;
		this.publications = publications;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublications() {
		return publications;
	}

	public void setPublications(String publications) {
		this.publications = publications;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", publications=" + publications + "]";
	}

	
}
