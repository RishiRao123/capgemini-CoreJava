package assignment;

public class Assignment3Main {

	public static void main(String[] args) {
		int[] arr = {5, 232, 121, 15, 2, 4, 9, 11, 18, 25, -616, 26, 31, -1, -16, -8};
		int n = arr.length;
		Assignment3 asg = new Assignment3();
		asg.elementsDivisibleBy5(arr, n);
		asg.evenIdxElements(arr, n);
		asg.evenElements(arr, n);
		asg.oddIdxElements(arr, n);
		asg.oddElements(arr, n);
		asg.evenPositiveElements(arr, n);
		asg.firstAndLastElements(arr, n);
		System.out.println("sum of elements are: " + asg.sumOfElements(arr, n));
		System.out.println("sum of even elements are: " + asg.sumOfEvenElements(arr, n));
		System.out.println("sum of odd elements are: " + asg.sumOfOddElements(arr, n));
		System.out.println("avg of elements(rounded to nearest int) is: " + asg.avgOfElements(arr, n));
		System.out.println("avg of even elements(rounded to nearest int) is: " + asg.avgOfEvenElements(arr, n));
		System.out.println("difference of even and odd sum is: " + asg.diffOfEvenAndOddSum(arr, n));
		System.out.println("armstrong numbers in arr is: " + asg.armstrongNumber(arr, n));
		asg.allArmstrongNumbers(arr, n);
		asg.palindromeElements(arr, n);
		
	}

}
