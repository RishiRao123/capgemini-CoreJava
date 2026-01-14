package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

// A practise task on Collection interface

// 1. User Activity Tracker
class ArrayListTask {
	public void userActivity() {
		ArrayList<String> al = new ArrayList<>();
		al.add("login");
		al.add("browse");
		al.add("add-to-cart");
		al.add("browse");
		al.add("logout");
		// printing all activities
		System.out.println("User Activity: " + al);
		// Total number of actions
		System.out.println("Total no.of Actions: " + al.size());
		ListIterator<String> litr = al.listIterator();
		// Remove all occurrences of "browse"
		while (litr.hasNext()) {
			String str = litr.next();
			if (str.equals("browse")) {
				litr.remove();
			}
		}
		// Printing final list
		System.out.println("Final Activity: " + al);
	}
}

// 2. Unique Logged-In Users
class HashSetTask {
	public void uniqueLoggedInUsers() {
		Set<String> st = new HashSet<>();
		st.add("Rishi");
		st.add("Amit");
		st.add("Rishi");
		st.add("Rahul");
		st.add("Amit");
		// Print Unique users
		System.out.println("Unique LoggedIn Users: " + st);
		// Count of unique users
		System.out.println("Count of users: " + st.size());
	}

}

// 3.Recently Viewed Products
class LinkedHashSetTask {
	public void recentlyViewedProducts() {
		Set<String> st = new LinkedHashSet<String>();
		st.add("Phone");
		st.add("Laptop");
		st.add("Mouse");
		st.add("Phone");
		st.add("Keyboard");
		// Print final set
		System.out.println("Products: " + st);
	}
}

// 4. Sorted Exam Scores
class SortedSetTask {
	public void sortedExamScores() {
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(85);
		ts.add(90);
		ts.add(70);
		ts.add(90);
		ts.add(60);
		// Print sorted scores
		System.out.println("Sorted scores: " + ts);
		System.out.println("Highest: " + ts.last() + " Lowest: " + ts.first());
		
	}
}

// 5. Student Roll Number Mapping
class MapTask {
	public void studentRollNumberMapping() {
		Map<Integer, String> mpp = new HashMap<>();
		mpp.put(101,  "Rishi");
		mpp.put(102,  "Amit");
		mpp.put(101,  "Rahul");
		// Print Map
		System.out.println("Map: " + mpp);
		// Print Size
		System.out.println("Size: " + mpp.size());
		// Name for roll 101
		System.out.println("Name of 101: " + mpp.get(101));
	}
 }

public class Practice1 {

	public static void main(String[] args) {

		// 1.
		ArrayListTask alt1 = new ArrayListTask();
		alt1.userActivity();
		// 2.
		HashSetTask hst1 = new HashSetTask();
		hst1.uniqueLoggedInUsers();
		// 3.
		LinkedHashSetTask lhst1 = new LinkedHashSetTask();
		lhst1.recentlyViewedProducts();
		// 4.
		SortedSetTask sst1 = new SortedSetTask();
		sst1.sortedExamScores();
		// 5.
		MapTask mp = new MapTask();
		mp.studentRollNumberMapping();
	}

}
