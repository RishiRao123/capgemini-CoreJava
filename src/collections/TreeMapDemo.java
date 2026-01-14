package collections;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> tmp1 = new TreeMap<>();
		tmp1.put(30, "C");
		tmp1.put(10, "A");
		tmp1.put(20, "B");
		
		System.out.println("TreeMap: " + tmp1); // sorted order, ignoring insertion order
		
	}

}
