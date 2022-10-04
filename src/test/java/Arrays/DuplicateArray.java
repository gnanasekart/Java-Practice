package Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class DuplicateArray {

	@Test
	public void example1() {
		String[] arr = {"AWS", "AZURE", "GCP", "ALIBABA", "DIGITAL OCEAN", "AWS", "AZURE", "GCP", "AWS", "AZURE", "AWS"};

		bruteForce(arr);
		setElement(arr);
		hashMaps(arr);
		streamSet(arr);
		streamGroupby(arr);
		streamFrequency(arr);
	}

	private void streamFrequency(String[] arr) {
		System.out.println("****Stream Frequency***");
		List<String> list = Arrays.asList(arr);
		Set<String> set = list.stream().filter(e -> Collections.frequency(list, e) > 1)
		.collect(Collectors.toSet());
		
		System.out.println(set);
	}

	private void streamSet(String[] arr) {
		System.out.println("****Stream Set and Filter****");
		Set<String> set = new HashSet<String>();

		Set<String> filteredArr = Arrays.asList(arr).stream()
				.filter(a -> !set.add(a))
				.collect(Collectors.toSet());

		filteredArr.forEach(f -> System.out.println(f));
	}

	private void streamGroupby(String[] arr) {
		System.out.println("****Stream GroupBy****");

		Set<String> filteredArr = Arrays.asList(arr).stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream()
				.filter(e -> e.getValue()>1)
				.map(Map.Entry::getKey)
				.collect(Collectors.toSet());

		filteredArr.forEach(f -> System.out.println(f));
	}

	private void hashMaps(String[] arr) {
		System.out.println("****HashMap****");
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(String a: arr) map.put(a, map.getOrDefault(a, 0)+1);

		Set<Entry<String, Integer>> entrySet = map.entrySet();
		entrySet.forEach(entry -> {
			if(entry.getValue() > 1) System.out.println(entry.getKey());
		});
	}

	private void bruteForce(String[] arr) {
		System.out.println("****Brute Force****");
		for(int i=0; i<arr.length; i++) 
			for (int j=i+1; j<arr.length; j++) 
				if(arr[i] == arr[j]) System.out.println(arr[i]);
	}

	private void setElement(String[] arr) {
		System.out.println("****setElement****");
		Set<String> set = new HashSet<String>();
		for(String a: arr) 
			if(!set.add(a)) System.out.println(a);
	}
}