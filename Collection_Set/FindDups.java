package Collection_Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class FindDups {

	@Test
	public void findDups(){
		List<Integer> list = Arrays.asList(2, 5, 2, 6, 7, 1, 7, 1, 7, 7);
		Set<Integer> set = new HashSet<>();

		Set<Integer> dup = list.stream().filter(item -> !set.add(item)).collect(Collectors.toSet());
		System.out.println(dup);
		}
}
