package strings;

public class StringMethodsDemo {

	public static void main(String[] args) {
		
		String s1 = "Hello";
		System.out.println(s1.length());

		System.out.println(s1.toUpperCase());

		System.out.println(s1.toLowerCase());

		System.out.println(s1.startsWith("H"));

		System.out.println(s1.endsWith("z"));

		System.out.println(s1.charAt(0));

		char c[] = s1.toCharArray();
		System.out.println(c);

		String s2 = "Pusukori Rishi Rao";
		String[] str = s2.split(" ");
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}

		String x = "Hiii";
		System.out.println(x.concat("Everyone"));

		String s3 = "Neeluri ";

		System.out.println(s3.substring(2));

		System.out.println(s3.substring(2, 4));

	}

}
