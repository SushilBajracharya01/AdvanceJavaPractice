package classWork;

import java.util.Arrays;

class Author {
	String name, email;
	char gender;
	
	//Constructor
	Author() {
		
	}
	Author(String name, String email, char gender) {
		this.email = email;
		this.name = name;
		this.gender = gender;
	}
}

class Book {
	String name;
	Author[] authors;
	double price;
	int qty = 0;
	
	Book(String name, Author[] authors, double price) {
		this.name = name;
		this.authors = authors;
		this.price = price;
	}
	
	Book(String name, Author[] authors, double price, int qty) {
		
	}
	
	String getName() {
		return name;
	}

	public Author[] getAuthors() {
		return authors;
	}

	double getPrice() {
		return price;
	}
	
	void setPrice(double price) {
		this.price = price;
	}
	
	int getQty() {
		return qty;
	}
	
	void setQty(int qty) {
		this.qty = qty;
	}

	
	
	@Override
	public String toString() {
		return "Book [name=" + name + ", authors=" + Arrays.toString(authors) + ", price=" + price + ", qty=" + qty
				+ "]";
	}

	String getAuthorNames() {
		String authorNames = "";
		for(int i=0; i < authors.length; i++) {
			authorNames += authors[i].name;
			authorNames += ", ";
		}
		
		return authorNames;
	}
}
public class Practical5 {
	public static void main(String[] args) {
		Author au1 = new Author("J.K Rowling","Jk@gmail.com",'F');
		Author au2 = new Author("Sushil","sushil@gmail.com",'M');
		Author au3 = new Author("yoyo","yoyo@gmail.com",'F');
		
		Author[] AuthorArray = new Author[] { au1, au2, au3 };
		
		Book book1 = new Book("Harry Potter", AuthorArray , 332.23);
		
		System.out.println(book1.getAuthorNames());
		
		
		
	}
}
