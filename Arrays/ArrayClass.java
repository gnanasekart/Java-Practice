package Arrays;


import java.util.Arrays;

public class ArrayClass {

	public static void main(String[] args) {
	
	int[] one = {5, 2, 7, 1, 4, 7, 3};
	int[] two = Arrays.copyOf(one, one.length);
	 
	
	 Arrays.sort(one);
	 
	 //Integer.compare(one, two);
	 
	for (int i = 0; i < one.length; i++) {
		Integer.compare(two[i], one[i]);
		System.out.println(one[i]);
	}
	
	}
	
}
