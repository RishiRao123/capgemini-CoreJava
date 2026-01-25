package model_type_questions;

import java.util.Scanner;

class InvalidEntryException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidEntryException(String msg) {
		super(msg);
	}
}

class EntryUtility {

	public boolean validateEmployeeId(String employeeId) throws InvalidEntryException {

		if (employeeId == null || employeeId.length() != 10) {
			throw new InvalidEntryException("Invalid entry details\n");
		}

		if (!employeeId.matches("GOAIR/\\d{4}")) {
			throw new InvalidEntryException("Invalid entry details\n");
		}

		return true;
	}

	public boolean validateDuration(int duration) throws InvalidEntryException {

		if (duration < 1 || duration > 5) {
			throw new InvalidEntryException("Invalid entry details\n");
		}

		return true;
	}
}

public class Practise5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		EntryUtility utility = new EntryUtility();

		System.out.println("Enter the number of entries");
		int n = sc.nextInt();
		sc.nextLine(); 

		for (int i = 1; i <= n; i++) {

			System.out.println("Enter entry " + i + " details");
			String input = sc.nextLine();
			
			String[] parts = input.split(":");

			try {
				
				utility.validateEmployeeId(parts[0]);
				utility.validateDuration(Integer.parseInt(parts[2]));

				System.out.println("Valid entry details\n");

			} catch (InvalidEntryException e) {
				System.out.println(e.getMessage());
			}
		}

		sc.close();

	}

}
