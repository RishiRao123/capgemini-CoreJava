package exception_handling;

// A task for practice on exceptional handling

// Level 1: Basics

class BasicTask1 {
	public void divideNumbers(int a, int b) {
		try {
			int result = a / b;
			System.out.println("result: " + result);
		} catch (ArithmeticException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			System.out.println("Division attempt completed\n");
		}
	}
}

class BasicTask2 {
	public void invalidArrayIndex(int idx) {
		try {
			int[] arr = { 2, 5, 8, 7, 25 };
			System.out.println(arr[idx]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			System.out.println("Array element access attempt completed\n");
		}
	}
}

class BasicTask3 {
	public void finallyBehaviour() {
		try {
			int a = 20;
			int b = 0;
			System.out.println("result: " + a / b);
		} catch (ArithmeticException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			System.out.println("Executing finally\n");
		}
	}
}

class BasicTask4 {
	public void numberFormat(String input) {
		try {
			int number = Integer.parseInt(input);
			System.out.println("Converted number: " + number);
		} catch (NumberFormatException e) {
			System.out.println("Invalid input! Cannot convert string to integer.");
		}
	}
}

public class Practise1 {

	public static void main(String[] args) {
		// Basic
		// 1.
		BasicTask1 bst1 = new BasicTask1();
		bst1.divideNumbers(10, 5);
		bst1.divideNumbers(20, 0);
		// 2.
		BasicTask2 bst2 = new BasicTask2();
		bst2.invalidArrayIndex(3);
		bst2.invalidArrayIndex(6);
		// 3.
		BasicTask3 bst3 = new BasicTask3();
		bst3.finallyBehaviour();
		bst3.finallyBehaviour();
		// 4.
		BasicTask4 bst4 = new BasicTask4();
		bst4.numberFormat("123");
		bst4.numberFormat("15a");

	}

}
