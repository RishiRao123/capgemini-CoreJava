package functional_programming;

import java.util.*;

//  A lambda expression is a short way to implement a functional interface 
//  (an interface with only one abstract method).
//  (parameters) -> { body }

interface Message {
	void say();
}

interface Add {
	int sum(int a, int b);
}

interface Check {
	boolean test(int n);
}

interface Length {
	int getLength(String s);
}

interface Operation {
	int apply(int a, int b);
}

public class FunctionalProgramming1 {

	public static void main(String[] args) {

		Message m = () -> System.out.println("Hello Lambda");
		m.say();

		Add a1 = (a, b) -> a + b;
		System.out.println(a1.sum(10, 25));

		Check c1 = n -> n % 2 == 0;
		System.out.println(c1.test(6));

		Length l1 = str -> str.length();
		System.out.println(l1.getLength("JavaLambda"));

		List<String> names = Arrays.asList("Rishi", "Amit", "Neha");
		names.forEach(System.out::println);

		List<Integer> nums = Arrays.asList(5, 2, 8, 1);
		nums.sort((x, y) -> x - y);
		System.out.println(nums);

		Operation add = (a, b) -> a + b;
		Operation sub = (a, b) -> a - b;
		Operation mul = (a, b) -> a * b;

		System.out.println(add.apply(10, 60));
		System.out.println(sub.apply(10, 60));
		System.out.println(mul.apply(10, 60));

	}

}
