package exception_handling;

import java.util.Scanner;

class InvalidAgeException extends Exception {

	private static final long serialVersionUID = 1L;

	public InvalidAgeException(String message) {
		super(message);
	}
}

public class UnderAgeException {

	static void validateAge(int age) throws InvalidAgeException {

		if (age < 18) {
			throw new InvalidAgeException("Age must be 18 or above to register.");
		} else {
			System.out.println("Registration successful!");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Enter your age: ");
			int age = sc.nextInt();
			validateAge(age);

		} catch (InvalidAgeException e) {
			System.out.println("Custom Exception Caught: " + e.getMessage());

		} finally {
			sc.close();
			System.out.println("Program ended.");
		}

	}

}
