package collections;

import java.util.ArrayList;
import java.util.List;

// List is interface extending, collection. It is used when order of data is important and duplicate 
// values allowed.



public class ListDemo {

	public static void main(String[] args) {
		
		List<String> activity = new ArrayList<>();
		
		activity.add("login");
		activity.add("logout");
		activity.add("view product");
		activity.add("added to cart");
		
		activity.add(0, "User");
		activity.set(1, "Exploring");
		activity.remove(3);
		
		System.out.println(activity);
	}

}
