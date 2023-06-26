package Java_Version_8.Automation;

import java.util.Arrays;

import org.testng.annotations.Test;

public class FindMinAndMax {

	@Test
	public void example1() {
		int[] arr = {3, 5, 1, 4, 8, 11, 9};
		findMax(arr);
		System.out.println(findMin(arr));
	}

	private void findMax(int[] arr) {
		
		 Arrays.stream(arr)
				.reduce((a,b) -> (a>b ? a : b))
				.ifPresent(max -> System.out.println(max));
				
	}

	private int findMin(int[] arr) {
		
		return Arrays.stream(arr).reduce((a,b) -> (a<b?a:b))
				.orElse(Integer.MIN_VALUE);
	}
}
