package strings;

public class Demo {
	public static void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public static void largestNum(int a, int b) {
		System.out.println((a > b) ? a : b);
	}
	
	public static void evenOdd(int a) {
		System.out.println((a % 2 == 0) ? "Even" : "Odd");
	}
	
	public static void posOrNeg(int a) {
		System.out.println((a > 0) ? "Positive" : "Negative");
	}
	
	public static void isEligible(int a) {
		System.out.println((a > 15) ? "Yes" : "No");
	}
	
	public static void isPass(int a) {
		System.out.println((a >= 40) ? "Pass" : "Fail");
	}
	
	public static void isDivisibleByFive(int a) {
		System.out.println((a % 5 == 0) ? "Divisible by 5" : "Not Divisible by 5");
	}
	
	public static void isDivisibleByTen(int a) {
		System.out.println((a % 10 == 0) ? "Divisible by 10" : "Not Divisible by 10");
	}
	
	public static void isDivisibleBy35(int a) {
		System.out.println((a%3 == 0 && a%5 == 0) ? "Divisible by both 3 & 5" : "Not Divisible by both 3 & 5");
	}
	
	public static void isDivisibleByAny35(int a) {
	    if (a % 3 == 0 && a % 5 == 0) {
	        System.out.println("Divisible by both 3 & 5");
	    } else if (a % 3 == 0) {
	        System.out.println("Divisible by 3");
	    } else if (a % 5 == 0) {
	        System.out.println("Divisible by 5");
	    } else {
	        System.out.println("Not divisible by 3 or 5");
	    }
	}
	
	public static void isEligibleForExam(int a, int b) {
		System.out.println((a >= 75 && b >= 14) ? "Eligible to write Exam" : "Not Eligible to write Exam");
	}
}
