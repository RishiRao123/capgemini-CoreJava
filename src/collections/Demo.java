package collections;

import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Demo {

	public static void main(String[] args) {
		// 1.
		List<Integer> nums = List.of(5, 10, 15, 20, 25, 30);
		Predicate<Integer> isGreater1 = num -> num > 15;

		nums.stream().filter(isGreater1).forEach(System.out::println);
		
		// 2.
		List<String> names = List.of("Suresh", "Ramesh", "Ankit", "Rohit", "Aman");
		Predicate<String> startsWith = name -> name.startsWith("A");
		
		names.stream().filter(startsWith).map(String::toUpperCase).forEach(System.out::println);
		
		// 3.
		List<Integer> numbers = List.of(3, 6, 9, 12, 15, 18);
		Predicate<Integer> isDivisible1 = num -> num % 3 == 0;
		Predicate<Integer> isGreater2 = num -> num > 10;
		Predicate<Integer> isAcceptable = isDivisible1.and(isGreater2);
		
		numbers.stream().filter(isAcceptable).forEach(System.out::println);
		
		// 4.
		List<String> words = List.of("java", "stream", "api", "predicate", "code");
		Predicate<String> isGreater3 = word -> word.length() > 4;
		
		List<String> result = words.stream().filter(isGreater3).toList();
		
		System.out.println(result);
		
		// 5.
		Supplier<Integer> supplier = () -> new Random().nextInt(100);
		Predicate<Integer> isEven = num -> num % 2 == 0;
		Consumer<Integer> printer = num -> System.out.println("Even Number: " + num);
		
		Stream.generate(supplier).limit(10).filter(isEven).forEach(printer);
	}

}
