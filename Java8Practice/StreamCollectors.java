package Java8Practice;

import java.util.Comparator;
import java.util.Optional;import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class StreamCollectors implements Comparator<String> {
	
	@Test
	public void maxby() {
		Stream<String> s = Stream.of("4", "7", "25", "87"); //obj.isPresent() => true
		Stream<String> s1 = Stream.of();//obj.isPresent() => false
		//Optional<String> obj = s.collect(Collectors.maxBy(Comparator.naturalOrder()));//5
		//Optional<String> obj1 = s.collect(Collectors.maxBy(Comparator.reverseOrder()));//2
		
	      Optional<String> op = s.collect(Collectors.maxBy(String::compareTo));//87
		System.out.println(op.get());
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
	      System.out.println(stream.collect(Collectors.toSet()));
	      
	}

}
