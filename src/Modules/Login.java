package Modules;

import java.util.Scanner;

public class Login {

	static String username = "admin";
	static String password = "admin123";
	static String securityQuestion = "What is your favorite color?";
	static String securityAnswer = "blue";

	static Scanner sc = new Scanner(System.in);

	public static boolean validate(String a, String b) {
		return a.equals(b);
	}

	public static boolean login() {
		System.out.print("Enter username: ");
		String enteredUsername = sc.nextLine();

		System.out.print("Enter password: ");
		String enteredPassword = sc.nextLine();

		if (validate(username, enteredUsername) && validate(password, enteredPassword)) {
			System.out.println("Login Successful ✅");
			return true;
		} else {
			System.out.println("Invalid credentials ❌");
			return false;
		}
	}

	public static void forgotPassword() {
		System.out.print("Enter username: ");
		String enteredUsername = sc.nextLine();
		if (validate(username, enteredUsername)) {
			System.out.println(securityQuestion);
			String answer = sc.nextLine();

			if (validate(securityAnswer, answer)) {
				System.out.print("Enter new password: ");
				password = sc.nextLine();
				System.out.println("Password reset successful ✅");
			} else {
				System.out.println("Security answer incorrect ❌");
			}
		} else {
			System.out.println("Username not found ❌");
		}
	}

	public static void main(String[] args) {

		System.out.println("Welcome to Login System");

		if (!login()) {
			System.out.println("1. Try Again");
			System.out.println("2. Forgot Password");
			int option = Integer.parseInt(sc.nextLine());

			if (option == 1) {
				login();
			} else if (option == 2) {
				forgotPassword();
			} else {
				System.out.println("Invalid option");
			}
		}

		sc.close();
	}
}
