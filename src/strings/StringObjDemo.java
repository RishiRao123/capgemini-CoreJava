package strings;

public class StringObjDemo {

	public static void main(String[] args) {
		
		// Here the space is created only in string constant pool area inside heap
		String s1 = "Hello";
		System.out.println(s1);
		String s2 = "hii";
		String s3 = "Hello";
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		
		// Here the object is created in both string pool area and heap as we use new keyword
		String s4 = new String("Hello");
		String s5 = new String("Hello");
		System.out.println(s4 == s5);
		System.out.println(s4.equals(s5)); // String class aldready overrides the equals method of object.

	}

}
