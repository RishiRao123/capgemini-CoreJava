package inheritance;

class EmployeeBase {
	public int id;
	public double salary;
	
	EmployeeBase(int id, double salary) {
		this.id = id;
		this.salary = salary;
	}
	
	public void display() {
		System.out.println("ID: " + id + " Salary: " + salary);
	}
}

class Manager extends EmployeeBase {
	
	double bonus;
	
	Manager(int id, double salary, double bonus) {
		super(id, salary);
		this.bonus = bonus;
		
	}
	
	public void calculateTotalSalary() {
		System.out.println(salary += bonus);
	}
}

public class Inheritance1 {

	public static void main(String[] args) {
		EmployeeBase e1 = new EmployeeBase(61416, 25000);
		e1.display();
		Manager m1 = new Manager(61416, 25000, 5000);
		m1.display();
		m1.calculateTotalSalary();
	}

}
