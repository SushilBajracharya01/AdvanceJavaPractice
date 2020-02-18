package classWork;

import java.util.Arrays;

class Author {
	String name, email;
	char gender;
}

class Book {
	String name;
	Author[] authors;
	double price;
	int qty = 0;
	
	Book(String name, Author[] authors, double price) {
		
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

//	String getAuthorNames() {
//		
//		for(int i=0; i < .length; i++) {
//			
//		}
//	}
}
public class Practical5 {
	public static void main(String[] args) {
//		Book book1 = new Book();
		
	}
}
