package Java_Version_8.java8Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class convert_2_StreamToArr {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Integer[] arr = Stream.of(1,2,3,4,5,6,7,8,9,10,11,12,13)
			.filter(x -> x%2 == 0)
			.toArray(Integer[]::new);
		
		for(Integer a: arr)
			System.out.println(a);
	}
}
