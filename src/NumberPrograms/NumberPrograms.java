package NumberPrograms;

public class NumberPrograms {

	public static int noOfDigits(int num) {
		int ans = 0;
		while(num > 0) {
			num = num/10;
			ans++;
		}
		return ans;
	}
	
	public static int sumOfDigits(int num) {
		int sum = 0;
		while(num > 0) {
			int digit = num % 10;
			sum += digit;
			num = num / 10;
		}
		return sum;
	}
	
	public static int productOfDigits(int num) {
		int sum = 1;
		while(num > 0) {
			int digit = num % 10;
			sum *= digit;
			num = num / 10;
		}
		return sum;
	}
	
	public static boolean isSpyNumber(int num) {
		boolean ans = false;
		int sum = sumOfDigits(num);
		int product = productOfDigits(num);
		
		if(sum == product) 
			ans = true;;
		
		return ans;
	}
	
	public static boolean isPrimeNumber(int num) {
	    if (num <= 1) {
	        return false;
	    }
	    if (num == 2) {
	        return true;
	    }
	    if (num % 2 == 0) {
	        return false;
	    }

	    for (int i = 3; i * i <= num; i += 2) {
	        if (num % i == 0) {
	            return false;
	        }
	    }
	    return true;
	}
	
	public static String factorsOfNumber(int num) {
		
		if(num < 0)
			return "num should be greater than 0";
		
		String factors = "";
		
		for(int i=1; i<=num; i++) {
			if(num % i == 0)
				factors += i + " ";
		}
		return factors;
	}
	
//	public static void factorsOfDigits(int num) {
//		if(num < 0)
//			return;
//		
//		
//		
//		while(num > 0) {
//			int digit = num % 10;
//			System.out.print("factors of digit " + digit + " are : ");
//			factorsOfNumber(digit);
//			System.out.println();
//			num = num / 10;
//		}
//	}
	
	public static void factorsOfDigits(int num) {
	    if (num < 0)
	        return;

	    String s = String.valueOf(num);

	    for (int i = 0; i < s.length(); i++) {
	        int digit = s.charAt(i) - '0';
	        System.out.print("Factors of digit " + digit + " are: ");
	        factorsOfNumber(digit);
	        System.out.println(); // next line
	    }
	}
	
	public static int factorialOfNumber(int num) {
		if(num <= 1)
			return 1;
	
		return num * factorialOfNumber(num-1);
	}
	
	public static void factorialOfDigit(int num) {
		if(num <= 0)
			return;
		
		String str = String.valueOf(num);
		
		for(int i=0; i<str.length(); i++) {
			int digit = str.charAt(i) - '0';
			System.out.print("Factorial of digit " + digit + " are: " + factorialOfNumber(digit));
			System.out.println();
		}
		
	}
	
	public static int sumOfFactorialOfDigits(int num) {
		if(num <= 0)
			return 0;
		
		int sum = 0;
		while(num > 0) {
			int digit = num % 10;
			sum += factorialOfNumber(digit);
			num = num / 10;
		}
		return sum;
	}
	
	public static boolean isStrongNumber(int num) {
		int sumOfFactors = sumOfFactorialOfDigits(num);
		
		return (sumOfFactors == num);
	}
	
	public static boolean isNeonNumber(int num) {
		if(num < 0)
			return false;
		
		int sq = num * num;
		int sum = 0;
		while(sq > 0) {
			int digit = sq % 10;
			sum += digit;
			sq = sq / 10;
		}
		return (sum == num);
	}

	public static boolean isSunnyNumber(int num) {
	    if (num < 0)
	        return false;

	    int next = num + 1;
	    int sqrt = (int) Math.sqrt(next);

	    return (sqrt * sqrt == next);
	}
	
	public static int sumOfProductsOfDigits(int num, int power) {
		if(num < 0)
			return 0;
		
		int sum = 0;
		while(num > 0) {
			int digit = num % 10;
			sum += Math.pow(digit, power); 
			num = num / 10;
		}
		return sum;
	}
	
	public static boolean isArmstrongNumber(int num) {
		int power = noOfDigits(num);
		int sum = sumOfProductsOfDigits(num, power);
		return num == sum;
	}


	public static void main(String[] args) {
		
		System.out.println("no of digits : " + noOfDigits(12345));
		System.out.println("sum of digits : " + sumOfDigits(12345));
		System.out.println("sum of digits : " + productOfDigits(12345));
		System.out.println("is Spy number : " + isSpyNumber(12345));
		System.out.println("is Prime number : " + isPrimeNumber(7));
		System.out.println("factors of number are : " + factorsOfNumber(9));
		factorsOfDigits(249);
		System.out.println("factorial : " + factorialOfNumber(5));
		factorialOfDigit(524);
		System.out.println("Is Strong Number : " + isStrongNumber(145));
		System.out.println("Is neon number : " + isNeonNumber(1));
		System.out.println("Is Sunny number : " + isSunnyNumber(8));
		System.out.println("Is Armstrong number : " + isArmstrongNumber(153));
	}

}
