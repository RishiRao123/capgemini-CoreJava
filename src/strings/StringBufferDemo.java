package strings;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer();
		s1.append("Hello");
		System.out.println(s1);

		// insert
		s1.insert(1, "loo");
		System.out.println(s1);

		// reverse
		s1.reverse();
		System.out.println(s1);

		// replace
		s1.replace(1, 3, "full");
		System.out.println(s1);

		s1.reverse();

		// delete
		System.out.println(s1.delete(1, s1.length() - 1));

		// capacity
		System.out.println(s1.capacity());

		s1.append("abcd");
		System.out.println(s1.length());
		System.out.println(s1.capacity());
	}

}
