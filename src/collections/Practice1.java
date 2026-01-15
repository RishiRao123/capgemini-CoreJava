package collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
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
		mpp.put(101, "Rishi");
		mpp.put(102, "Amit");
		mpp.put(101, "Rahul");
		// Print Map
		System.out.println("Map: " + mpp);
		// Print Size
		System.out.println("Size: " + mpp.size());
		// Name for roll 101
		System.out.println("Name of 101: " + mpp.get(101));
	}
}

// 6. Marks Processing System
class HashMapTask {
	public void marksProcessingSystem() {
		HashMap<String, Integer> mpp = new HashMap<>();
		mpp.put("Rishi", 85);
		mpp.put("Amit", 40);
		mpp.put("Rahul", 65);
		mpp.put("karan", 30);
		// Remove students with marks < 50
		Iterator<Map.Entry<String, Integer>> it = mpp.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Integer> entry = it.next();
			if (entry.getValue() < 50) {
				it.remove();
			}
		}
		System.out.println("Students: " + mpp);
	}
}

// 7. Employee Salary Report
class TreeMapTask {
	public void employeeSalaryReport() {
		TreeMap<Integer, Integer> tmp = new TreeMap<>();
		tmp.put(103, 50000);
		tmp.put(101, 70000);
		tmp.put(102, 60000);
		// Print the map
		System.out.println("Salary report:" + tmp);
	}
}

//8. Configuration Loader
class LinkedHashMapTask {
	public void configurationLoader() {
		LinkedHashMap<String, String> lhmp = new LinkedHashMap<>();
		lhmp.put("url", "localhost");
		lhmp.put("port", "8080");
		lhmp.put("timeout", "5000");
		// Prints the entries in same order
		System.out.println("Configurations: " + lhmp);
	}
}

// 9. Unique Products
class ProductTask {
	int id;
	String name;

	ProductTask(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		ProductTask p = (ProductTask) o;
		return this.id == p.id;
	}

	@Override
	public int hashCode() {
		return Integer.hashCode(id);
	}
}

// 10.Sorted Employee Records
class EmployeeTask {
	int id;
	String name;
	double salary;

	EmployeeTask(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
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
		// 6.
		HashMapTask hmpt1 = new HashMapTask();
		hmpt1.marksProcessingSystem();
		// 7.
		TreeMapTask tmpt1 = new TreeMapTask();
		tmpt1.employeeSalaryReport();
		// 8.
		LinkedHashMapTask lhmp1 = new LinkedHashMapTask();
		lhmp1.configurationLoader();
		// 9.
		Set<ProductTask> products = new HashSet<>();
		products.add(new ProductTask(1, "Phone"));
		products.add(new ProductTask(2, "Laptop"));
		products.add(new ProductTask(1, "Keyboard")); // duplicate id

		System.out.println("Products count: " + products.size());
		for (ProductTask p : products) {
			System.out.println(p.id + " " + p.name);
		}
 
		// 10.
		Comparator<EmployeeTask> salaryComparator = new Comparator<EmployeeTask>() {
			public int compare(EmployeeTask e1, EmployeeTask e2) {
				return Double.compare(e1.salary, e2.salary);
			}
		};
		
		TreeSet<EmployeeTask> employees = new TreeSet<>(salaryComparator);

		employees.add(new EmployeeTask(1, "Rishi", 70000));
		employees.add(new EmployeeTask(2, "Amit", 50000));
		employees.add(new EmployeeTask(3, "Rahul", 60000));
		employees.add(new EmployeeTask(4, "Karan", 50000)); // duplicate salary
		
		for (EmployeeTask e : employees) {
			System.out.println(e.name + " " + e.salary);
		}


	

	}

}
