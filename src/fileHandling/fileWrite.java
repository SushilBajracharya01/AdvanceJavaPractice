package fileHandling;

import java.io.FileWriter;

class Offemployee {
	int id, age, salary;
	String fname, lname, location, contact;

	Offemployee(int id, int age, int salary, String fname, String lname, String location, String contact) {
		this.id = id;
		this.age = age;
		this.salary = salary;
		this.fname = fname;
		this.lname = lname;
		this.location = location;
		this.contact = contact;
	}
}

public class fileWrite {
	public static void main(String[] args) {
		Offemployee oe = new Offemployee(1, 23, 20000, "Raju", "Baju", "Kathmandu", "9812345677");
		try {
			FileWriter fw = new FileWriter("D:/testout.txt");
			fw.write("id\t" + "Age\t" + "Salary\t" + "First Name\t" + "Last Name\t" + "Location\t" + "Contact no.\t");
			fw.write("\n" + oe.id + "\t" + oe.age + "\t" + oe.salary + "\t" + oe.fname + "\t\t" + oe.lname + "\t\t"
					+ oe.location + "\t" + oe.contact + "\t");
			fw.close();
		} catch (Exception e) {
			//
		}
		System.out.println("File created");
	}
}
