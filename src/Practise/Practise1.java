package Practise;

import java.util.Scanner;

class Car {
	String name;
	int number;

	Car() {
		this.name = "Thar";
		this.number = 1256;
	}
}

class Cat {
	String name;
	int age;

	Cat() {
		this.name = "Ginger";
		this.age = 1;
	}

	public static void main(String[] args) {
		System.out.println("main method of cat class");
	}
}

//Always java program file should be public class name only. Atmost one public class is possible
//public class Gard {
//	
//}

public class Practise1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name : ");
		String name = sc.nextLine();
		System.out.println(name);
		Car c1 = new Car();
		System.out.println(c1.name + " " + c1.number);
		Cat ct1 = new Cat();
		System.out.println(ct1.name + " " + ct1.age);
		
		sc.close();

	}

}
