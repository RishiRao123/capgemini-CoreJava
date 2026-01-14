package collections;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
//		1️.TreeSet cannot store null because it must compare elements
//		2️.In TreeSet, comparison result 0 = duplicate (not equals())
		
		TreeSet<Integer> ts1 = new TreeSet<>();
		ts1.add(30);
		ts1.add(10);
		ts1.add(20);
		ts1.add(10);
		ts1.add(40);
		
		System.out.println("TreeSet: " + ts1);
		System.out.println("Size: " + ts1.size());

	}

}
