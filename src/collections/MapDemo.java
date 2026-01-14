package collections;

import java.util.Map;
import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<Integer, String> mpp = new HashMap<>();
		mpp.put(1, "A");
		mpp.put(2, "B");
		mpp.put(1, "C");
		
		System.out.println("Map: " + mpp);
		System.out.println("Size: " + mpp.size());
		System.out.println("Value: " + mpp.get(1));

	}

}
