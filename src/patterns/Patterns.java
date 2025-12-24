package patterns;

import java.util.Scanner;

public class Patterns {
	
	public static void pattern1(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void pattern2(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void pattern3(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i+1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void pattern4(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	
	public static void pattern5(int n) {
		for(int i=1; i<=2*n-1; i++) {
			int stars = i <= n ? i : 2*n-i;
			for(int j=1; j<=stars; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
	public static void pattern6(int n) {
		for(int i=1; i<=2*n-1; i++) {
			int stars = i <= n ? i : 2*n-i;
			int spaces = i<= n ? n-i : i-n;
			for(int k=1; k<=spaces; k++) {
				System.out.print(" ");
			}
			for(int j=1; j<=stars; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
	public static void pattern7(int n) {
		for(int i=1; i<=n; i++) {
			int spaces = n - i;
			for(int k=1; k<=spaces; k++) {
				System.out.print("  ");
			}
			for(int j=i; j>=1; j--) {
				System.out.print(j + " ");
			}
			for(int j=2; j<=i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	
	public static void pattern8(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i==1 || j==1 || i==n || j==n) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of rows : ");
		int rows = sc.nextInt();
		
//		pattern1(rows);
//		pattern2(rows);
//		pattern3(rows);
//		pattern4(rows);
//		pattern5(rows);
//		pattern6(rows);		
//		pattern7(rows);
		pattern8(rows);

		
		sc.close();
	}
}