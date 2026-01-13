package objectclass;

public class ObjectClassDemo2 {

	static class Student {
		String name;
		int age;
		String address;

		public Student(String name, int age, String address) {
			this.name = name;
			this.age = age;
			this.address = address;
		}

		// overriding the toString method
		public String toString() {
			return "Student Name: " + name + " \nStudent age: " + age + " \nStudent Address: " + address;
		}

		public boolean equals(Student s) {
			return this.name == s.name && this.age == s.age && this.address == s.address;
		}

		public int hashCode() {
			return this.name.hashCode() + age + this.address.hashCode();
		}

	}

	public static void main(String[] args) {

		Student student1 = new Student("Varun Kumar", 21, "Telangana");
		Student student2 = new Student("Varun Kumar", 21, "Telangana");
		Student student3 = student1;

		System.out.println(student1.equals(student3));
		System.out.println(student1.equals(student2));
		System.out.println(student1 == student2);

		// so without overriding the hashcode method this line gives the false because
		// it generates the integer number based on address
		// after overriding it generates the integer number on the properties
		System.out.println(student1.hashCode() == student2.hashCode());
		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());

//				System.out.println(student1);
//				System.out.println(student2);

	}

}
