package collections;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<String> l1 = new LinkedList<>();
		
		l1.add("Open app");
		l1.add("Login");
		l1.add("Browse products");
		l1.add("Add to cart");
		l1.add("Add address");
		l1.add("Pay money");
		l1.addFirst("Visit the depolyed link");
		System.out.println("List before: " + l1);
		l1.removeLast();
		
		System.out.println("List: " + l1 + "\nSize: " + l1.size());
		
		// constructors
		// 1. LinkedList<T> ll = new LinkedList<>();
		// 2. LinkedList<T> ll = new LinkedList<>(Collection);
		
	}

}
