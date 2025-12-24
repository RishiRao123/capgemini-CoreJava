package assignment;

public class Assignment3 {
	
	public void elementsDivisibleBy5(int[] arr, int n) {
		System.out.print("Elements divisible by 5 are: ");
		for(int i=0; i<n; i++) {
			if(arr[i] % 5 == 0) {
				System.out.print(arr[i] + " ");
			}
				
		}
		System.out.println();
	}
	
	public void evenIdxElements(int[] arr, int n) {
		System.out.print("even index elements of arr are: ");
		for(int i=0; i<n; i++) {
			if(i % 2 == 0)
				System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public void evenElements(int[] arr, int n) {
		System.out.print("even elements of arr are: ");
		for(int i=0; i<n; i++) {
			if(arr[i] % 2 == 0)
				System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public void oddIdxElements(int[] arr, int n) {
		System.out.print("odd index elements of arr are: ");
		for(int i=0; i<n; i++) {
			if(i % 2 != 0)
				System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public void oddElements(int[] arr, int n) {
		System.out.print("odd elements of arr are: ");
		for(int i=0; i<n; i++) {
			if(arr[i] % 2 != 0)
				System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public void evenPositiveElements(int[] arr, int n) {
		System.out.print("even posistive elements of arr are: ");
		for(int i=0; i<n; i++) {
			if(arr[i] > 0 && arr[i] % 2 == 0)
				System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public void firstAndLastElements(int[] arr, int n) {
		int first = arr[0], last = arr[n-1];
		System.out.println("first and last elements of arr are: " + first + " " + last);
	}
	
	public int sumOfElements(int[] arr, int n) {
		int sum = 0;
		for(int i=0; i<n; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	public int sumOfEvenElements(int[] arr, int n) {
		int sum = 0;
		for(int i=0; i<n; i++) {
			if(arr[i] % 2 == 0)
				sum += arr[i];
		}
		return sum;
	}
	
	public int sumOfOddElements(int[] arr, int n) {
		int sum = 0;
		for(int i=0; i<n; i++) {
			if(arr[i] % 2 != 0)
				sum += arr[i];
		}
		return sum;
	}
	
	public int avgOfElements(int[] arr, int n) {
		int sum = sumOfElements(arr, n);
		int avg = sum / n;
		return avg;
	}
	
	public int avgOfEvenElements(int[] arr, int n) {
		int sum = sumOfEvenElements(arr, n);
		int numberOfDigits = 0;
		for(int num : arr) {
			if(num % 2 == 0)
				numberOfDigits++;
		}
		int avg = sum / numberOfDigits;
		return avg;
	}
	
	public int diffOfEvenAndOddSum(int[] arr, int n) {
		int oddSum = sumOfOddElements(arr, n);
		int evenSum = sumOfEvenElements(arr, n);
		int ans =  evenSum - oddSum;
		if(ans < 0)
			return -2*ans + ans;
		
		return ans;
	}
	private int noOfDigits(int num) {
	    if (num == 0)
	        return 1;

	    int ans = 0;
	    while (num > 0) {
	        num /= 10;
	        ans++;
	    }
	    return ans;
	}

	private int sumOfProductsOfDigits(int num, int power) {
	    int sum = 0;
	    while (num > 0) {
	        int digit = num % 10;
	        sum += (int) Math.pow(digit, power);
	        num /= 10;
	    }
	    return sum;
	}

	private boolean isArmstrongNumber(int num) {
	    if (num < 0)
	        return false;

	    int power = noOfDigits(num);
	    int sum = sumOfProductsOfDigits(num, power);
	    return num == sum;
	}

	public int armstrongNumber(int[] arr, int n) {
	    for (int i = 0; i < n; i++) {
	        if (isArmstrongNumber(arr[i])) {
	            return arr[i];
	        }
	    }
	    return -1;
	}
	
	public void allArmstrongNumbers(int[] arr, int n) {
	    System.out.print("Armstrong numbers in array: ");
	    for (int num : arr) {
	        if (isArmstrongNumber(num)) {
	            System.out.print(num + " ");
	        }
	    }
	    System.out.println();
	}
	
	private boolean isPalindrome(int num) {
		if(num < 0)
			return false;
		
		String str = String.valueOf(num);
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		return str.equals(sb.toString());
	}
	
	public void palindromeElements(int[] arr, int n) {
		System.out.print("palindrome elements in array are: ");
		for(int i=0; i<n; i++) {
			if(isPalindrome(arr[i]))
				System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
