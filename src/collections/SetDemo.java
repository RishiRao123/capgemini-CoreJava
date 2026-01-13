package collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		
		Set<Integer> st1 = new HashSet<>();
		st1.add(10);
		st1.add(20);
		st1.add(10);
		st1.add(30);
		st1.add(20);
		
		System.out.println("Set: " + st1);
		System.out.println("Size: " + st1.size());
		
	}

}
