package polymorphism;

class Shape {
	public void area() {
		System.out.println("area");
	}
}

class Circle extends Shape {
	@Override
	public void area() {
		System.out.println("area of circle");
	}
}

class Rectangle extends Shape {
	@Override
	public void area() {
		System.out.println("area of rectangle");
	}
}

public class Polymorphism1 {

	public static void main(String[] args) {
		
		Shape s1 = new Circle();
		Shape s2 = new Rectangle();
		
		s1.area();
		s2.area();

	}

}
