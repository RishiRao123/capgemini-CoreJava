package abstraction;


abstract class Employee {
	int id;
	String name;
	
	Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	abstract public double calculateSalary();
	
	public void display() {
		System.out.println(name + " " + id);
	}
}

class PermanentEmployee extends Employee {
	double salary;
	
	PermanentEmployee(int id, String name, double salary) {
		super(id, name);
		this.salary = salary;
		System.out.println("Permanent Employee: ");
	}
	
	public double calculateSalary() {
		return salary;
	}
}

class ContractEmployee extends Employee {
	int workedHrs;
	double hourlyRate;
	
	ContractEmployee(int id, String name, int hrs, double hpr) {
		super(id, name);
		this.workedHrs = hrs;
		this.hourlyRate = hpr;
		System.out.println("Contract Employee: ");
	}
	
	public double calculateSalary() {
		return workedHrs * hourlyRate;
	}
}

public class Abstraction1 {

	public static void main(String[] args) {
		
		Employee e1 = new PermanentEmployee(101, "rishi rao", 65000);
		Employee e2 = new ContractEmployee(102, "karan rao", 40, 1000);
		
		e1.display();
		System.out.println(e1.calculateSalary());
		e2.display();
		System.out.println(e2.calculateSalary());

	}

}
