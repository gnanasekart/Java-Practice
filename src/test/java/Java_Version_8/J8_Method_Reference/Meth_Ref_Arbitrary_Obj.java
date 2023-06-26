package Java_Version_8.J8_Method_Reference;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Meth_Ref_Arbitrary_Obj {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(15, 33, 59, 24, 40, 2, 19, 25,60);

		//using anonymos inner class
		Collections.sort(numbers, new Comparator<Integer>() {
			public int compare(Integer i1, Integer i2) {
				return i1.compareTo(i2);
			}
		});
			
		//lambda
		Collections.sort(numbers, (i1, i2) -> i1.compareTo(i2));
		
		//method reference
		Collections.sort(numbers, Integer::compareTo);
		
		//numbers.forEach(System.out::println);
		numbers.forEach(n -> System.out.print(n+" "));
	}

}
