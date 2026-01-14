package collections;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
//		Need uniqueness + sorting → TreeSet
//		Need uniqueness + speed → HashSet
//		Need uniqueness + order → LinkedHashSet
		
		HashSet<String> hs1 = new HashSet<>();
		hs1.add("A");
		hs1.add("B");
		hs1.add("A");
		hs1.add("C");
		
		System.out.println("HashSet: " + hs1);
		System.out.println("Add: " + hs1.add("A"));

	}

}
