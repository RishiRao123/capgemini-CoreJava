package loops;

import java.util.*;

public class Loops {
	
	public static void main(String[] args) {
		
//		int i = 1;
//		while(i<=5) {
//			System.out.println("*");
//			i++;
//		}
//		
//		int j = 1;
//		do {
//			System.out.println("j : " + j);
//			j++;
//		} while(j<3);
		
		Scanner sc = new Scanner(System.in);
//		boolean decision;
//		do {
//			System.out.println("Welcome !!!");
//			System.out.println("Do you want me to print again? ");
//			System.out.println("Yes: true No: false");
//			
//			decision = sc.nextBoolean();
//			   
//		} while(decision);
//		
//		for(int vishnu=1; vishnu<=3; vishnu++) {
//			System.out.println("Vishnukanth");
//		}
		
//		int num = 4;
//		for(int i=1; i<=num; i++) {
//			for(int j=1; j<=num; j++) {
//				if(i==4 || j==4) {
//					System.out.print("*");
//				} else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}

// 6
//		int rows = 4;
//		for(int i=1; i<=rows; i++) {
//			for(int j=1; j<=rows; j++) {
//				if(i==1) {
//					System.out.print("*");
//				} else if(i==4) {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}

// 	5
//		int rows = 4;
//		for(int i=1; i<=rows; i++) {
//			for(int j=1; j<=rows; j++) {
//				if(j==1) {
//					System.out.print("* ");
//				} else if(j==4) {
//					System.out.print("*");
//				} else {
//					System.out.print("- ");
//				}
//			}
//			System.out.println();
//		}
//		
		
//		for(int i=1; i<=4; i++) {
//			for(int j=1; j<=4; j++) {
//				if(i==j) {
//					System.out.print("* ");
//				} else {
//					System.out.print("- ");
//				}
//			}
//			System.out.println();
//		}
		
//		for(int i=4; i>=1; i--) {
//			for(int j=4; j>=1; j--) {
//				if(i==j) {
//					System.out.print("* ");
//				} else {
//					System.out.print("- ");
//				}
//			}
//			System.out.println();
//		}
		
//		for(int i=1; i<=4; i++) {
//			for(int j=1; j<=4; j++) {
//				if(i<=j) {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}
		
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=4; j++) {
				if(i+j <= 5)
					System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		  
		sc.close();
	}
}
