package collections;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

	public static void main(String[] args) {
		ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

		map.put(1, "A");
		map.putIfAbsent(1, "B");

		System.out.println(map.get(1)); // A

	}

}
