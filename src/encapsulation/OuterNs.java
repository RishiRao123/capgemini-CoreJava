package encapsulation;

public class OuterNs {
	class Inner {
		static void display() {
			System.out.println("Inner class");
		} 
		
		void test() {
			System.out.println("Inner non static method");
		}
	}
	
	public static void main(String[] args) {
		OuterNs.Inner.display();
		OuterNs n1 = new OuterNs();
		Inner i1 = n1.new Inner();
		i1.test();
		Inner.display();
	}

}
