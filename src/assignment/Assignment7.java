package assignment;

// a assignment on Abstraction

// 1.
abstract class Payment {
	abstract void processPayment(double amount);

	public void printReceipt() {
		System.out.println("Receipt: ");
	}
}

class CreditCardPayment extends Payment {
	public void processPayment(double amount) {
		System.out.println("Credit Card payment: " + amount);
	}
}

class UPIPayment extends Payment {
	public void processPayment(double amount) {
		System.out.println("UPI payment: " + amount);
	}
}

class NetBankingPayment extends Payment {
	public void processPayment(double amount) {
		System.out.println("Net Banking payment: " + amount);
	}
}

class PaymentService {
	public void pay(Payment p, double amount) {
		p.printReceipt();
		p.processPayment(amount);
	}
}

// 2.
abstract class Ride {
	abstract void calculateFare(int distance);

	void rideDeails() {
		System.out.println("Ride details: ");
	}
}

class BikeRide extends Ride {
	void calculateFare(int distance) {
		System.out.println("Total Bike ride Fare: " + distance * 7);
	}
}

class AutoRide extends Ride {
	void calculateFare(int distance) {
		System.out.println("Total Auto ride Fare: " + distance * 10);
	}
}

class CarRide extends Ride {
	void calculateFare(int distance) {
		System.out.println("Total Car ride Fare: " + distance * 13);
	}
}

class RideService {
	public void bookRide(Ride ride, int distance) {
		ride.rideDeails();
		ride.calculateFare(distance);
	}
}

// 3.
abstract class BankAccount {
	abstract void calculateInterest();

	void deposit() {
		System.out.println("Deposit money: ");
	}

	void withdraw() {
		System.out.println("Withdraw amount: ");
	}
}

class SavingsAccount1 extends BankAccount {
	void calculateInterest() {
		System.out.println("Savings Account Interest rate is 6%");
	}
}

class CurrentAccount extends BankAccount {
	void calculateInterest() {
		System.out.println("Current Account Interest rate is 12%");
	}
}

class BankAccountService {
	public void getInterestRate(BankAccount account) {
		account.deposit();
		account.withdraw();
		account.calculateInterest();
	}
}

// 4.
abstract class Employee1 {
	String name;
	String department;

	Employee1(String name, String department) {
		this.name = name;
		this.department = department;
	}

	abstract void calculateSalary();

	void displayDetails() {
		System.out.println("Name: " + name + " Department: " + department);
	}
}

class FullTimeEmployee extends Employee1 {
	double salary;
	double hra;
	
	FullTimeEmployee(String name, String department, double salary, double hra) {
		super(name, department);
		this.salary = salary;
		this.hra = hra;
	}
	
	void calculateSalary() {
		double totalSalary = salary + hra;
		System.out.println("Fulltime employee slaray (salary + hra): " + totalSalary);
	}
}

class PartTimeEmployee extends Employee1 {
	double salary;
	int workingHrs;
	
	PartTimeEmployee(String name, String department, double salary, int workingHrs) {
		super(name, department);
		this.salary = salary;
		this.workingHrs = workingHrs;
	}
	
	void calculateSalary() {
		double totalSalary = salary * workingHrs ;
		System.out.println("Parttime employee slaray (all included): " + totalSalary);
	}
}

class SalaryService {
	public void getSalary(Employee1 e) {
		e.displayDetails();
		e.calculateSalary();
	}
}

// 5.
abstract class Restaurant {
	abstract void prepareFood();
	
	void orderReceived() {
		System.out.println("Order received!");
	}
}

class FastFoodRestaurant extends Restaurant {
	void prepareFood() {
		System.out.println("Fast food restaurant, Preparing your order.");
	}
}

class FineDiningRestaurant extends Restaurant {
	void prepareFood() {
		System.out.println("Fine Dining restaurant, Preparing your order.");
	}
}

class OrderService {
	public void getOrder(Restaurant rst) {
		rst.orderReceived();
		rst.prepareFood();
	}
}

public class Assignment7 {

	public static void main(String[] args) {

//		PaymentService ps = new PaymentService();
//		ps.pay(new CreditCardPayment(), 5000);
//		ps.pay(new UPIPayment(), 650.77);
//		ps.pay(new NetBankingPayment(), 7859.33);

//		Ride br = new BikeRide();
//		Ride ar = new AutoRide();
//		Ride cr = new CarRide();
//
//		br.rideDeails();
//		br.calculateFare(10);
//		ar.rideDeails();
//		ar.calculateFare(15);
//		cr.rideDeails();
//		cr.calculateFare(55);

//		RideService service = new RideService();
//
//		service.bookRide(new BikeRide(), 10);
//		service.bookRide(new AutoRide(), 15);
//		service.bookRide(new CarRide(), 55);

//		BankAccountService bs = new BankAccountService();
//
//		bs.getInterestRate(new SavingsAccount1());
//		bs.getInterestRate(new CurrentAccount());
		
//		SalaryService slry = new SalaryService();
//		
//		slry.getSalary(new FullTimeEmployee("Rishi rao", "Development", 75000.00, 2550.00));
//		slry.getSalary(new PartTimeEmployee("Karan rao", "Testing", 2500.00, 40));
		
		OrderService os = new OrderService();
		
		os.getOrder(new FastFoodRestaurant());
		os.getOrder(new FineDiningRestaurant());
		
	}

}
