package collections;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		// constructors :
		// 1. Vector v = new Vector() capacity 10 next cc = 2 * cc
		// 2. Vector v = new Vector(int initialcc)
		// 3. Vector v = new Vector(int initialCC, incrementalCC)
		// 4. Vector v = new Vector(Vector v)
		
		Vector<Integer> v = new Vector<>();
		for(int i=1; i<=5; i++) {
			v.add(i);
		}
		System.out.println("Vector: " + v);
		v.remove(2);
		System.out.println("Vector: " + v);
		
		// Try not use vector or stack class as they belongs to legacy class. There are alternate 
		// available methods
		

	}

}
