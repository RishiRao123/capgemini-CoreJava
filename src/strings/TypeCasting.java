package strings;

public class TypeCasting {

	public static void main(String[] args) {
		double a = 10.02;
		int b = (int) a;
		System.out.println("Implicit conversion: " + b);
		
		int c = 25;
		double d = c;
		System.out.println("Explicit conversion: " + d);
		
		Integer fun = 250;
		if(!(fun instanceof Integer)) {
			System.out.println(fun);
		} else {
			System.out.println("Hello");
		}
		
		boolean isTrue = a >= b;
		if(isTrue) {
			System.out.println("a > b");
		}
		
		int runs = 100;
		switch(runs) {
			case 50:
				System.out.println("half century");
			case 100:
				System.out.println("century");
		}
			

	}
}
