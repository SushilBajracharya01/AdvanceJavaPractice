package classWork;

/*
 * Practical Question 3:
 * 			
		Design a class called Employee and it contains:
		1.	Three instance variables: id, firstName, lastName and salary of variable types int, string,string and int  respectively
		2.	Constructors- a constructor which takes an argument for id, firstName, lastName and salary.
		3.	Two method getAnnualSalary (), raiseSalary ()
		4.	Add getter methods for above variable.
		5.	Add setter methods for above variables.
		6.	 Add a method tostring().

 * Author: Sushil S. Bajracharya
 * Date: 2076/11/05
 * */

class Employee {
	// id, firstName, lastName and salary instance variables
	int id, salary;
	String firstName, lastName;
	
	
	
	//Constructor
	
	Employee() {
		
	}
	
	Employee(int id, String firstName, String lastName, int salary) {
		this.id = id;
		this.firstName= firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	
	//Two method getAnnualSalary (), raiseSalary ()
	public float getAnnualSalary() {
		return this.salary * 12;
	}
	
	public int raiseSalary(int percent) {
		int amount = (percent/100) * salary;
		this.salary = salary + amount;
		return salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", getAnnualSalary()=" + getAnnualSalary() + ", getId()=" + getId() + ", getSalary()=" + getSalary()
				+ ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}

public class Practical3 {
	public static void main(String[] args) {
		Employee Emp1 = new Employee(1, "Sushil", "Bajracharya", 300000);
		System.out.println(Emp1.toString());
	}
}
