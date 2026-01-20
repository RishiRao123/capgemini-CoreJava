package exception_handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Task 1

class UserNameValidationException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;

	UserNameValidationException(String name) {
		super("Invalid username: " + name);
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

class AgeValidationException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int age;

	AgeValidationException(int age) {
		super("Invalid age: " + age);
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
}

class UserService {
	void registerUser(String name, int age) {
		if (name == null || name.isEmpty()) {
			throw new UserNameValidationException(name);
		}
		if (age < 18) {
			throw new AgeValidationException(age);
		}

		System.out.println("User registered: " + name);

	}
}

class InsufficientBalanceException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int accountId;
	private double balance;

	public InsufficientBalanceException(int accountId, double balance) {
		super("Account " + accountId + " has insufficient balance: " + balance);
		this.accountId = accountId;
		this.balance = balance;
	}

	public int getAccountId() {
		return accountId;
	}

	public double getBalance() {
		return balance;
	}
}

class BankAccount {
	private int accountId;
	private double balance;

	BankAccount(int accountId, double balance) {
		this.accountId = accountId;
		this.balance = balance;
	}

	void withdraw(double amount) {
		if (amount <= 0) {
			throw new IllegalArgumentException();
		}
		if (amount > balance) {
			throw new InsufficientBalanceException(accountId, balance);
		}
		balance -= amount;
		System.out.println("Withdrawal successful. Remaining balance: " + balance);
	}

}

class FileProcessingException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FileProcessingException(String filePath, Throwable cause) {
		super("Error processing file at path: " + filePath, cause);
	}
}

class FileProcessor {
	public void processFile(String filePath) throws IOException {
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			throw new FileProcessingException(filePath, e);
		}
	}
}

class OrderDataAccessException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int orderId;

	OrderDataAccessException(int orderId, Throwable cause) {
		super("Data access failure for orderId: " + orderId, cause);
		this.orderId = orderId;
	}

	public int getOrderId() {
		return orderId;
	}
}

class OrderNotFoundException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public OrderNotFoundException(int orderId) {
		super("Order not found for id: " + orderId);
	}
}

class OrderRepository {

	public String findOrderById(int orderId) {
		if (orderId == 500)
			throw new RuntimeException("DB connection failed");

		if (orderId != 1)
			return null;

		return "ORDER-FOUND";

	}
}

class OrderService1 {

	private final OrderRepository repository = new OrderRepository();

	public String processOrder(int orderId) {
		try {
			String result = repository.findOrderById(orderId);
			if (result == null) {
				throw new OrderNotFoundException(orderId);
			}
			return result;
		} catch (RuntimeException ex) {
			throw new OrderDataAccessException(orderId, ex);
		}
	}
}

class OrderController {

	private final OrderService1 service = new OrderService1();

	public void handleOrder(int orderId) {
		try {
			service.processOrder(orderId);
		} catch (OrderNotFoundException ex) {
			System.out.println(ex.getMessage());
		} catch (OrderDataAccessException ex) {
			System.out.println("A system error occurred. Please try again later.");
		}
	}
}

public class Practise2 {

	public static void main(String[] args) {

		// 1.
		UserService us1 = new UserService();
		try {
			us1.registerUser("", 15);
		} catch (UserNameValidationException e) {
			System.out.println("User name must be provided. " + e.getMessage());
		} catch (AgeValidationException e) {
			System.out.println("Age must be greater than 18. " + e.getMessage());
		}

		// 2.
		BankAccount ba1 = new BankAccount(25521, 5000.00);
		try {
			ba1.withdraw(10000.00);
		} catch (IllegalArgumentException e) {
			System.out.println("Enter correct number. " + e.getMessage());
		} catch (InsufficientBalanceException e) {
			System.out.println("Balnce is not sufficient. " + e.getMessage());
		}

		// 3.
//		FileProcessor fp1 = new FileProcessor();
//		try {
//			fp1.processFile("/drive");
//		} catch (FileProcessingException e) {
//			System.out.println("Enter correct number. " + e.getMessage());
//		} 

	}

}
