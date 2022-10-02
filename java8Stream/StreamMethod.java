package java8Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StreamMethod {

	ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("233", "456", "789", "788", "555"));
	ArrayList<String> list2 = new ArrayList<String>(Arrays.asList("aaa", "bbb", "ccc", "ddd", "abc"));

	//@Test
	public void streamOfMethod() {
		Stream<Integer> value = Stream.of("233", "456", "789", "788", "555")
				.map(s -> Integer.parseInt(s)).sorted(Comparator.reverseOrder()).limit(1);

	}

	@Test
	public void streamBuilderMethod() {
		Stream.Builder<String> builder = Stream.builder();
		Stream<String> stream = builder.add("one").add("two").add("three").build();
		List<String> list = stream.map(String::toUpperCase).collect(Collectors.toList());
		list.forEach(System.out::println);
	}

	//@Test
	public void matches() {
		List<Integer> intList = Arrays.asList(2, 4, 5, 6, 8);

		boolean allEven = intList.stream().allMatch(i -> i % 2 == 0);
		boolean oneEven = intList.stream().anyMatch(i -> i % 2 == 0);
		boolean noneMultipleOfThree = intList.stream().noneMatch(i -> i % 3 == 0);

		Assert.assertFalse(allEven);
		//allMatch() checks if the predicate is true for all the elements in the stream.
		Assert.assertTrue(oneEven);
		//anyMatch() checks if the predicate is true for any one element in the stream.
		Assert.assertFalse(noneMultipleOfThree);
		//noneMatch() checks if there are no elements matching the predicate.
	}

	@Test
	public void foreach() {
		Random random = new Random();
		random.ints(0, 6).distinct().limit(5).forEach(System.out::println);
	}

	@Test
	public void parallelStr() {
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");

		//get count of empty string
		long count = strings.parallelStream().filter(string -> string.isEmpty()).count();
		System.out.println(count);
	}

	//different way of creating stream

	@Test
	public void example1() {
		Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
		stream.forEach(p -> System.out.println(p));
	}

	@Test
	public void example2() {
		Integer[] arr = new Integer[] {1,2,3,4,5,6,7,8,9};
		Stream<Integer> stream = Stream.of(arr);
		stream.forEach(p -> System.out.println(p));
	}

	@Test
	public void example3() {
		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		Stream<Integer> stream = list.stream();
		stream.forEach(p -> System.out.println(p));
	}

	//@Test
	public void example4() {
		Stream<Date> stream = Stream.generate(() -> {return new Date();});
		stream.forEach(p -> System.out.println(p));
	}

	//method 5 - find ASCII value by converting charArray 
	@Test
	public void example5() {
		IntStream intstream = "12345_abcde".chars();
		intstream.forEach(p -> System.out.println(p));
	}
	
	@Test
	public void streamConcat() {
		List<Integer> list1 = new ArrayList<>(Arrays.asList(1,3,5,7,9));
		List<Integer> list2 = new ArrayList<>(Arrays.asList(2,4,6,8,10));
		
		Stream<Integer> str = Stream.concat(list1.stream(), list2.stream());
		str.forEach(s -> System.out.print(s+" "));
	}

}
