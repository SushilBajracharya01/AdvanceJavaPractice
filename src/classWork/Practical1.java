package classWork;
/*
 * Practical Question 1:
 * 			Design a class called Circle and it contains:
		1.	Two private instance variables: radius (of the type double) and color (of type string) with the default value of 1.0 and “red” respectively.
		2.	Two overloaded constructors- a default constructor and a constructor which takes a argument for radius.
		3.	Two public method getRadius (), getcircumference () and getArea() which return the radius , circumference and area of this instance respectively.
		More Basic OOP concepts:
		1.	Modify the class circle to include a third constructor for constructing a Circle instance with two arguments- a double for radius and a string for color.
		2.	Add a getter method (getColor) for variable color for retrieving the color of this instance.
		3.	Add setter methods (setColor and setRadius) for changing the radius and color of a circle instance.
		4.	Use special keyword “this”.
		5.	Add a method tostring().

 * Author: Sushil S. Bajracharya
 * Date: 2076/11/05
 * */

class Circle {
	double radius;
	String color;
	
	//default Constructor
	Circle(){};
	
	//Constructor with an argument (radius)
	Circle(double radius) {
		this.radius = radius;
	}
	
	//Constructor with 2 arguments (radius and color)
	Circle (double radius, String color) {
		this.radius = radius;
		this.color = color;
	}
	
	
	public void getArea() {
		System.out.println("The area of the circle is "+ 3.1415 * radius * radius);
	}
	
	public void getCircumference() {
		System.out.println("The Circumference of the circle is "+ 2 * 3.1415 * radius);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "]";
	}
	
	
	
	
}


public class Practical1 {
	public static void main(String[] args) {
//		Circle c = new Circle(14); // creating an object of a circle
//		c.getArea();
//		c.getCircumference();
		
		Circle dc = new Circle(); // creating an object with default constructor;
		
		dc.setRadius(14);
		System.out.println(dc.getRadius());
		
		dc.getArea();
		dc.getCircumference();
		
		dc.setColor("Red");
		System.out.println(dc.getColor());
		
		System.out.println(dc.toString()); 
		
		
	}
	
}
