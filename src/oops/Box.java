package oops;

//public class Box {
//	//non-static variables
//	double length;
//	double breadth;
//	
//	Box(double length, double breadth) {
//		this.length = length;
//		this.breadth = breadth;
//	}
//	
//	//non-static method
//	public double area() {
//		return length * breadth;
//	}
//	
//	public double perimeter() {
//		return 2 * (length + breadth);
//	}
//	
//	public static void m1() {
//		System.out.println("Static method");
//	}
//
//	public static void main(String[] args) {
//		Box b1 = new Box(3, 6);
//		System.out.println(b1.area());
//		Box.m1();
//		m1();
//		System.out.println(b1);
//		
//	}
//
//}

public class Box {
	//non-static variables
	static double length = 16;
	static double breadth = 4;
	
//	static Box(double length, double breadth) {
//		this.length = length;
//		this.breadth = breadth;
//	}
//	
	//non-static method
	public double area() {
		return length * breadth;
	}
	
	public double perimeter() {
		return 2 * (length + breadth);
	}
	
	public static void m1() {
		System.out.println("Static method");
	}

	public static void main(String[] args) {
		Box b1 = new Box();
		System.out.println(b1.area());
		Box.m1();
		
		
	}

}
