package Methods;

public class Methods {
	
	public static int sum(int ...numbers) {
		if(numbers.length == 0) {
			System.out.println("No parameters passewd...");
		}
		
		int result = 0;
		for(int num : numbers) {
			result += num;
		}
		return result;
	}
	
	public static void areaOfCircle() {
		float r = 3.5f;
		float area = (float) Math.PI * r * r; 
		System.out.printf("%.2f%n", area);
	}
	
	public static void areaOfSquare() {
		double s = 3.5;
		double area = Math.pow(s, 2); 
		System.out.printf("%.2f%n", area);
	}
	
	public static float areaOfSquare2() {
		float s = 3.5f;
		float area = (float) Math.pow(s, 2); 
		//System.out.printf("%.2f%n", area);
		return area;
	}
	
//	private static double gravity(double g = 9.8) {
//		
//	}
	
	public static void main(String[] args) {
		
		System.out.println("result: " + sum(25, 70));
		System.out.println("result: " + sum(25, 70, 85, 90, 120));
		areaOfCircle();
		areaOfSquare();
		System.out.println(areaOfSquare2());
	}

}
