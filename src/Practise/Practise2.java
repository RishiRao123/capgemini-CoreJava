package Practise;

import java.time.LocalDate;

abstract class Person {
	int id;
	String name;
	int age;
	String phone;

	Person(int id, String name, int age, String phone) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.phone = phone;
	}

	void printPersonDetails() {
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Phone: " + phone);
	}

	void getDetails() {
		printPersonDetails();
	}

	abstract void showRole();
}

class Member extends Person {
	double height;
	double weight;
	int memberShipMonths;
	double bmi;
	LocalDate expiryDate;

	Member(int id, String name, int age, String phone, double height, double weight, int memberShipMonths) {
		super(id, name, age, phone);
		this.height = height;
		this.weight = weight;
		this.memberShipMonths = memberShipMonths;
		this.bmi = weight / (Math.pow(height / 100, 2));
		this.expiryDate = LocalDate.now().plusMonths(memberShipMonths);
	}

	@Override
	public void showRole() {
		System.out.println("Role: I am a Member");
	}

	void printMemberInfo() {
		System.out.println("Height: " + height + " cm");
		System.out.println("Weight: " + weight + " kg");
		System.out.printf("BMI: %.2f%n", bmi);
		System.out.println("Membership Expires On: " + expiryDate);
	}

	@Override
	void getDetails() {
		System.out.println("---Member Details---");
		super.getDetails();
		printMemberInfo();
	}

}

class Trainer extends Person {
	String speciality;
	double hourlyRate;
	int hoursWorked;
	double salary;

	Trainer(int id, String name, int age, String phone, String speciality, double hourlyRate, int hoursWorked) {
		super(id, name, age, phone);
		this.speciality = speciality;
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
		this.salary = hourlyRate * hoursWorked;
	}

	@Override
	public void showRole() {
		System.out.println("Role: I am a Trainer");
	}

	@Override
	void getDetails() {
		System.out.println("--- Trainer Details ---");
		super.getDetails();
		System.out.println("Speciality: " + speciality);
		System.out.println("Salary: " + salary);
	}
}

interface DietPlanReceiver {
	void receiveDietPlan();
}

class PremiumMember extends Member implements DietPlanReceiver {
	String packageType;
	Trainer trainer;
	double discountPercent;
	double baseFee;
	double finalFee;

	PremiumMember(int id, String name, int age, String phone, double height, double weight, int memberShipMonths,
			String packageType, Trainer trainer, double discountPercent, double baseFee) {
		super(id, name, age, phone, height, weight, memberShipMonths);
		this.packageType = packageType;
		this.trainer = trainer;
		this.discountPercent = discountPercent;
		this.baseFee = baseFee;
		this.finalFee = baseFee * (1 - discountPercent);
	}

	@Override
	public void receiveDietPlan() {
		System.out.println("Diet Plan Assigned: Yes");
	}

	@Override
	public void showRole() {
		System.out.println("Role: I am a Premium Member");
	}

	@Override
	void getDetails() {
		System.out.println("---Premium Member Details---");

		printPersonDetails();
		printMemberInfo();

		System.out.println("Package: " + packageType);
		System.out.println("Assigned Trainer: " + trainer.name);
		System.out.println("Final Fee After Discount: " + finalFee);
		receiveDietPlan();
	}

}

public class Practise2 {
	public static void main(String[] args) {
		Member m1 = new Member(101, "Alice", 25, "98765", 165.0, 60.0, 5);

		Trainer t1 = new Trainer(201, "John Coach", 30, "99887", "Weight Training", 5000.0, 2);

		PremiumMember pm1 = new PremiumMember(102, "Bob", 28, "77441", 170.0, 72.0, 5, "Gold", t1, 0.10, 5000.0);

		Person[] people = { m1, pm1, t1 };

		for (Person p : people) {
			p.getDetails();
			p.showRole();
			System.out.println();
		}

	}
}
