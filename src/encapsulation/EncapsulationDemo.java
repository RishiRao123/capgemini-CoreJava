package encapsulation;

class Employee {
	private int id;
	private double salary;
	
	{
		id = 61416;
	}

	public void setSalary(double salary) {
		if (salary > 0) {
			this.salary = salary;
		} else {
			System.out.println("Enter correct amount");
		}
	}

	public int getEmployeeId() {
		return id;
	}

	public double getSalary() {
		return salary;
	}
}

public class EncapsulationDemo {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setSalary(25000.50);
		System.out.println(e1.getSalary());
		System.out.println(e1.getEmployeeId());
	}
}
