package collections;

import java.util.Enumeration;
import java.util.Vector;

public class CursorsDemo {

	public static void main(String[] args) {

		// Cursors are used when you wnat to get data from a collection one by one.
		// three types : Enumeration, Iterator and ListIterator

		// 1. Enumeration : (Legacy 1.0v)
		// Enumeration e = v.elements(); v is vector object.
		// it has two methods only 1. public boolean hasMoreElements() 2.public Object
		// nextElement();

		// code for enumeration

		Vector<Integer> v1 = new Vector<>();

		for (int i = 0; i <= 10; i++) {
			v1.addElement(i);
		}

		System.out.println("Vector: " + v1);

		Enumeration<Integer> e = v1.elements();

		while (e.hasMoreElements()) {
			Integer i = e.nextElement();
			if (i % 2 == 0)
				System.out.print(i + " ");
		}

	}

}
