package classWork;


class Account {
	String id, name;
	int balance =0;
	
	
	Account( String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	Account( String id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	
	String getID() {
		return this.id;
	}
	
	String getName() {
		return this.name;
	}
	
	int getBalance() {
		return this.balance;
	}
	
	int credit(int amount) {
		this.balance = this.balance + amount;
		return this.balance;
	}
	
	int debit(int amount) {
		if (amount <= balance) {
			this.balance = this.balance - amount;
		}
		else {
			System.out.println("Amount exceeded balance");
		}
		return balance;
	}
	
	int transferTo(Account another, int amount) {
		if (amount <= balance) {
			another.balance += amount;
		}
		else {
			System.out.println("Amount exceeded balance");
		}
		
		return balance;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + ", getID()=" + getID() + ", getName()="
				+ getName() + ", getBalance()=" + getBalance() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
}

public class Practical4 {
	public static void main(String[] args) {
		Account acc1 = new Account("C1", "Ram", 2000);
		acc1.toString();
	}
}
