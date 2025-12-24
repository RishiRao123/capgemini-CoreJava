package strings;

import java.util.Scanner;

public class DynamicInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter name : ");
		String name = sc.nextLine(); 
		System.out.println("Enter regNo : ");
		String regNo = sc.nextLine(); 
		System.out.println("Enter age : ");
		int age = sc.nextInt();
		System.out.println("Enter grade : ");
		char grade = sc.next().charAt(0);
		
		System.out.println(name + " " + regNo + " " + age + " " + grade);
		
		sc.close();
	}
}
