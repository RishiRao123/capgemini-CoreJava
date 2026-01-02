package encapsulation;

public class Outer {
	static class Inner {
		static void display() {
			System.out.println("Static - method");
		}
		void test() {
			System.out.println("Non static method");
		}
	}
	
	public static void main(String[] args) {
		Outer.Inner.display();
		Outer.Inner o1 = new Inner();
		o1.test();
	}
}
