package classWork;


/*
* Practical Question 2: Design a class called Rectangle and it contains:
*1	Two private instance variables: length (of the type float) and width (of type float) with the default value of 1.0f and 1.0f respectively.
*2	Two overloaded constructors- a default constructor and a constructor which takes an argument for length and width.
*3	Two public method getArea (), getPerimetr () which return the Area and perimeter of rectangle respectively.
*4    Add getter methods for variable length and width for retrieving the color of this instance.
*5     Add setter methods for changing the length and width of a circle instance.
*6.	Use special keyword “this”.
*7.	Add a method tostring().

* Author: Sushil S. Bajracharya
* Date: 2076/11/05
* 
*/


class Rectangle {
	
	// length and width private variables 
	private float length;
	private float width;
	
	// Two overloaded constructors
	
	//- default constructor
	Rectangle() {
		
	}
	
	//- contructor that takes width and height
	Rectangle(float length, float width) {
		this.length = length;
		this.width = width;
	}
	
	// Two user defined methods getArea and getPerimeter.
	public float getArea() {
		return length * width;
	}
	
	public float getPerimeter() {
		return 2*(length * width);
	}
	
	// getter and setter for length and width
	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}
	
	
	// toString method 
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + ", getArea()=" + getArea() + ", getPerimeter()="
				+ getPerimeter() + ", getLength()=" + getLength() + ", getWidth()=" + getWidth() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
}
public class Practical2 {
	public static void main(String[] args) {
		
		
		Rectangle Rec = new Rectangle();
		
		Rec.setLength(10);
		System.out.println("Length: " + Rec.getLength());
		Rec.setWidth(30);
		System.out.println("Width: " + Rec.getWidth());
		
		System.out.println("Area of the Rectangle is " + Rec.getArea());
		System.out.println("Perimeter of the Rectangle is " + Rec.getPerimeter()); 
		
		
		
		Rectangle Rec2 = new Rectangle(20,50);
		
		Rec2.setLength(10);
		
		System.out.println("Area of the Rectangle is " + Rec2.getArea());
		System.out.println("Perimeter of the Rectangle is " + Rec2.getPerimeter()); 
		
		System.out.println(Rec2.toString()); 

	}
}
