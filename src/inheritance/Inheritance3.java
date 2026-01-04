package inheritance;

// A solid task showing use of inheritance covering all topics

class Employee {
	protected int id;
	protected String name;
	protected double baseSalary;

	Employee(int id, String name, double baseSalary) {
		this.id = id;
		this.name = name;
		this.baseSalary = baseSalary;
	}

	public double calculateSalary() {
		return baseSalary;
	}

	public void displayDetails() {
		System.out.println("ID: " + id + " Name: " + name + " Base Salary: " + baseSalary);
	}
}

class PermanentEmployee extends Employee {
	protected double hra;

	PermanentEmployee(int id, String name, double baseSalary, double hra) {
		super(id, name, baseSalary);
		this.hra = hra;
	}

	@Override
	public double calculateSalary() {
		return baseSalary + hra;
	}
}

class ContractEmployee extends Employee {
	protected int hoursWorked;
	protected double hourlyRate;

	ContractEmployee(int id, String name, double baseSalary, int hoursWorked, int hourlyRate) {
		super(id, name, baseSalary);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}

	@Override
	public double calculateSalary() {
		return hoursWorked * hourlyRate;
	}
}

public class Inheritance3 {

	public static void main(String[] args) {
		
		PermanentEmployee p1 = new PermanentEmployee(101,"Rishi rao", 50000, 5000);
		ContractEmployee c1 = new ContractEmployee(102, "Karan rao", 30000, 25, 1500);
		p1.displayDetails();
		c1.displayDetails();
		

	}
}
