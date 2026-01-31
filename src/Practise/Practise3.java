package Practise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student {
	private int id;
	private String name;
	private int marks;

	Student(int id, String name, int marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getMarks() {
		return marks;
	}
	
	public String toString() {
		return name + " - " + marks;
	}

}

class StudentUtility {

	private List<Student> studentList;

	StudentUtility(List<Student> studentList) {
		this.studentList = studentList;
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public Stream<Student> convertToStream(List<Student> list) {
		return list.stream();
	}

	public double averageMarks(Stream<Student> stream1) {
		return stream1.mapToDouble(Student::getMarks).average().orElse(0.0);
	}

	public Student findTopper(Stream<Student> stream1) {
		return stream1.max(Comparator.comparingDouble(Student::getMarks)).orElse(null);
	}

	public List<Student> sortByMarks(Stream<Student> stream1) {
		List<Student> sortedList = stream1.sorted(Comparator.comparingDouble(Student::getMarks))
				.collect(Collectors.toList());
		return sortedList;
	}

}

public class Practise3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of students:");
		int n = sc.nextInt();
		
		List<Student> students = new ArrayList<>();
		
		for(int i=1; i<=n; i++) {
			System.out.print("Enter Student ID:");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter Student name:");
			String name = sc.nextLine();
			System.out.print("Enter Marks:");
			int marks = sc.nextInt();
			sc.nextLine();
			students.add(new Student(id, name, marks));
		}
		
		StudentUtility su = new StudentUtility(students);
		
		System.out.printf("\nAverage Marks: %.2f", su.averageMarks(su.convertToStream(su.getStudentList())));
		
		System.out.println("\nTop scorer: " );
		System.out.println(su.findTopper(su.convertToStream(su.getStudentList())).toString());
		
		System.out.println("Students Sorted by Marks:");
		for(Student s : su.sortByMarks(su.convertToStream(su.getStudentList()))) {
			System.out.println(s.toString());
		}
		
		sc.close();
		
	}

}
