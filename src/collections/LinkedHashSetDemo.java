package collections;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		// Linked hash set is combination of both set and LinkedList.
		// LinkedHashSet = HashSet + LinkedList
		
		LinkedHashSet<Integer> lh1 = new LinkedHashSet<>();
		lh1.add(30);
		lh1.add(10);
		lh1.add(20);
		lh1.add(10);
		lh1.add(30);
		
		System.out.println("LinkedHashSet: " + lh1);
		System.out.println("Size: " + lh1.size());

	}

}
