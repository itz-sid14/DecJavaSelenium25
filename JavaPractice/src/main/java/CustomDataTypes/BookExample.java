package CustomDataTypes;

import java.time.LocalDate;


public class BookExample {
	
	private String name;
	
	private String author;
	
	private LocalDate published_date;
	
	private float price;

	public BookExample(String name, String author, LocalDate published_date, float price) {
		super();
		this.name = name;
		this.author = author;
		this.published_date = published_date;
		this.price = price;
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

	public LocalDate getPublished_date() {
		return published_date;
	}

	public void setPublished_date(LocalDate published_date) {
		this.published_date = published_date;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "BookExample [name=" + name + ", author=" + author + ", published_date=" + published_date + ", price="
				+ price + "]";
	}

	
	
}
