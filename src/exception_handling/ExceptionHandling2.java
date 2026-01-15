package exception_handling;

import java.util.Scanner;

public class ExceptionHandling2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value");
		int a = sc.nextInt();

		System.out.println("Enter the value");
		int b = sc.nextInt();

		if (b == 0) {
			sc.close();
			throw new ArithmeticException();
		} else {
			System.out.println(a / b);
		}

		sc.close();
	}

}
