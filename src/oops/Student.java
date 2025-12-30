package oops;

public class Student {
	int id;
	String name;
	int age;
	
	Student() {
		this(0, "null", 18);
	}
	
	Student(int id, String name) {
		this(id, name, 18);
	}
	
	Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public void getDetails() {
		System.out.println("Name: " + name + " " + "Id: " + id + " " +  "Age: " + age);
	}
	
	public static void main(String[] args) {
		
		Student s1 = new Student(12, "Rishi Rao");
		s1.getDetails();
	}
}
