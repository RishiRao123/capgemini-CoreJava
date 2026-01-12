package collections;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack<Integer> s1 = new Stack<>();
		
		for(int i=0; i<=5; i++) {
			s1.push(i);
		}
		System.out.println("peek: " + s1.peek());
		s1.pop();
		s1.pop();
		System.out.println("final stack: " + s1);
		System.out.println(s1.search(1)); // top to bottom numbering
		
		// constructor:
		// 1. Stack<> s = new Stack()

	}

}
