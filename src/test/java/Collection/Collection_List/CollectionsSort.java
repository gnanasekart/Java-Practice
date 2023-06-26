package Collection.Collection_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsSort {

	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<>();
		l.add("Z");
		l.add("A");
		l.add("K");
		l.add("N");
		
		int[] a = {10, 5, 20, 11, 6};

		
		//Default natural sorting order
		//Collections.sort(l);

		//Customized sorting order
		//Collections.sort(l, new MyComparator());
		System.out.println(l);

		/*
		 * binary search
		 * 
		 *   -1  -2  -3  -4  -5   -6    -> insertion point
			| A | K | M | Z | a |
  			  0   1   2   3   4        --> index

  			  For the list of n elements in the case of binary search method
				1. Successful search result range = 0 to n-1
				2. unsuccessful search result range = -(n+1) to -1
				3. Total result range = -(n+1) to n-1

		System.out.println(Collections.binarySearch(l, "A"));//insertion order = -1
		System.out.println(Collections.binarySearch(l, "A", new MyComparator()));//index = 3
		System.out.println(Collections.binarySearch(l, "L"));//insertion order = -1
		System.out.println(Collections.binarySearch(l, "L", new MyComparator()));//index = -3

		 */
		
		System.out.println(Arrays.binarySearch(a, 7));//insertion order = -1

		System.out.println(Arrays.binarySearch(a, 6));//insertion order = -1

		String[] s = {"A", "C", "Z", "B"};
		Arrays.sort(s);
		System.out.println(Arrays.binarySearch(s,"Z"));//2
		System.out.println(Arrays.binarySearch(s,"S"));//-3

		//reverse sorting
		//Collections.reverse(l);

		Arrays.sort(l.toArray(), Collections.reverseOrder());
		//Collections.reverseOrder();

		System.out.println(l);
	}
}

class MyComparator implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		return s2.compareTo(s1);
	}
}