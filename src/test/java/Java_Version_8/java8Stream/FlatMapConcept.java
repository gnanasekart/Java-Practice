package Java_Version_8.java8Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapConcept {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1, 3, 5, 7);
		List<Integer> list2 = Arrays.asList(2, 4, 6, 8);

		List<List<Integer>> lists = Arrays.asList(list1, list2);
		//System.out.println(lists);


		List<Integer> flatm = lists.stream()
				.flatMap(list -> list.stream())
				.collect(Collectors.toList());
		
		//System.out.println(flatm);
		
		
		list1.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}

}
