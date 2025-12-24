package assignment;

public class Assignment2 {
	
	public static void isDivisible(int num) {
		
		if(num%5==0 && num%11==0) {
			System.out.println("Is divisible");
		} else {
			System.out.println("Not divisible");
		}
	
	}
	
	public static void isGreater(int num1, int num2, int num3) {
		if(num1 > num2) {
			if(num2 > num3) {
				System.out.println("num1 is greater than num2, num3");
			}
		} else if (num2 > num1) {
			if(num2 > num3) {
				System.out.println("num2 is greater than num1, num3");
			}
		} else if(num3 > num1){
			if(num3 > num2) {
				System.out.println("num3 is greater than num1, num2");
			}
		} else {
			System.out.println("num1, num2, num3 all are equal");
			}
	}
	
	public static void isVowelOrConsonant(char ch) {
		ch = Character.toLowerCase(ch);
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
			System.out.println("It is a vowel");
		} else {
			System.out.println("It is a consonant");
		}
	}
	
	public static void isEvenOrOdd(int num) {
		if(num / 2 == 0) {
			System.out.println("It is Even");
		} else {
			System.out.println("It is Odd");
		}
	}
	
	public static void isPosOrNegOrZero(int num) {
		if(num == 0) {
			System.out.println("It is zero");
		} else if(num > 0) {
			System.out.println("It is positive");
		} else {
			System.out.println("It is negative");
		}
	}
	
	public static void daysInMonth(String month) {
		String m = month.toLowerCase();
		
		switch (m) {
		case "april":
	    case "june":
	    case "september":
	    case "november":
	        System.out.println("30 days");
	        break;
	    case "february":
	        System.out.println("28 or 29 days");
	        break;
	    default:
	        System.out.println("31 days");
		}

	}
	
	public static void characterType(char ch) {
		if(Character.isUpperCase(ch)) {
			System.out.println("Uppercase");
		} else if(Character.isLowerCase(ch)) {
			System.out.println("Uppercase");
		} else if(Character.isDigit(ch)) {
			System.out.println("Digit");
		} else {
			System.out.println("Special Character");
		}
	}
	
	public static void percentage(int n1,int n2,int n3,int n4,int n5) {
		int sum = n1+n2+n3+n4+n5;
		int per = (sum/5) * 100;
		System.out.println("Percentage : " + per + "%");
		
		if(per>=0 && per<=50) {
			System.out.println("Grade: B");
		} else if(per>50 && per<=70) {
			System.out.println("Grade: A");
		} else if(per>70 && per<=100) {
			System.out.println("Grade: A+");
		}
	}
	
//	public static void triangleType(int s1, int s2, int s3) {
//		
//	}
	
//	public static void calculator(int n1, int n2, char operator) {
//		
//		switch(operation)
//	}
}
