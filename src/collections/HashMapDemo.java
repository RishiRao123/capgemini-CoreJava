package collections;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer, String> mpp1 = new HashMap<>();
		mpp1.put(1, "One");
		mpp1.put(2, "Two");
		mpp1.put(1, "Updated");
		mpp1.put(3, "Three");
		
		System.out.println("Map: " + mpp1);
		System.out.println("Size: " + mpp1.size());
		System.out.println("Value: " + mpp1.get(1));
		

	}

}
