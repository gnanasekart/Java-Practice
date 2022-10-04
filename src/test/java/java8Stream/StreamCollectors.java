package java8Stream;

import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class StreamCollectors implements Comparator<String> {

	@Test
	public void maxby() {
		Stream<String> s = Stream.of("4", "7", "25", "87"); //obj.isPresent() => true
		Stream<String> s1 = Stream.of();//obj.isPresent() => false
		//Optional<String> obj = s.collect(Collectors.maxBy(Comparator.naturalOrder()));//5
		//Optional<String> obj1 = s.collect(Collectors.maxBy(Comparator.reverseOrder()));//2
		
		//Optional<String> obj1 = s.collect(Collectors.maxBy(Comparator.comparing(Person::getAge)));

		Optional<String> op = s.collect(Collectors.maxBy(String::compareTo));//87
		System.out.println(op.get());
	}

	@Test
	public void maxChar() {
		Stream<String> s = Stream.of("A", "V", "Z", "C"); 
		String op = s.max(Comparator.comparing(String::valueOf)).get();
		System.out.println(op);	
	}

	@Test
	public void minChar() {
		Stream<String> s = Stream.of("A", "V", "Z", "C"); 
		String op = s.min(Comparator.comparing(String::valueOf)).get();
		System.out.println(op);
	}

	@Test
	public void minby() {
		Stream<String> s = Stream.of("4", "7", "25", "87"); //obj.isPresent() => true
		Stream<String> s1 = Stream.of();//obj.isPresent() => false
		Optional<String> op = s.collect(Collectors.minBy((a, b) -> -compare(a, b)));//87
		System.out.println(op.get());
	}

	public int compare(String o1, String o2) {
		return o1.compareTo(o2);
	}

	@Test
	public void averageingInt() {
		Stream<String> stream = Stream.of("20", "50", "75", "100", "150", "200");
		double res = stream.collect(Collectors.averagingInt(a -> Integer.parseInt(a)));
		//Collectors.averagingDouble(a -> Double.parseDouble(a))
		//Collectors.averagingLong(a -> Long.parseLong(a))
		System.out.println("Arithmetic Mean = "+res);
	}

	@Test
	public void toset() {
		Stream<Integer> stream = Stream.of(20,50,75,100,150,200);
		//System.out.println(stream.collect(Collectors.counting()));//6
		System.out.println(stream.collect(Collectors.toSet()));//[50, 20, 100, 150, 200, 75]	      
	}

	@Test
	public void collections() {
		Stream<String> stream = Stream.of("20", "50", "80", "20", "100", "130", "150", "200");
		Collection<String> collection = stream.collect(Collectors.toCollection(TreeSet::new));
		System.out.println("Collection = "+collection);
	}

	@Test
	public void partitionby() {
		//partioningBy() method returns a Collector that partitions the input elements according to a Predicate,
		//and organizes them into a Map<Boolean, List<T>>.

		Stream<Integer> stream = Stream.of(25, 50, 75, 100, 125, 150);
		// true for stream element 50
		Map<Boolean, java.util.List<Integer>> m = stream.collect(Collectors.partitioningBy(a -> a == 50));
		System.out.println("Stream = "+ m);

	}

	@Test
	public void joining() {
		List<Character> list = Arrays.asList('D', 'e', 'm', 'o');
		String str = list.stream().map(String::valueOf).collect(Collectors.joining());
		System.out.println("Concatenated = "+str);
	}

}
