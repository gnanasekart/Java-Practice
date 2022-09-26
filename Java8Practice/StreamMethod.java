package Java8Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class StreamMethod {
	
	ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("233", "456", "789", "788", "555"));
	ArrayList<String> list2 = new ArrayList<String>(Arrays.asList("aaa", "bbb", "ccc", "ddd", "abc"));
	
	@Test
	public void Stream() {
		Stream<Integer> value = Stream.of("233", "456", "789", "788", "555").map(s -> Integer.parseInt(s)).sorted(Comparator.reverseOrder())
		 .limit(1);
		
		
		value.forEach(System.out::println);
				
		
	}

}
