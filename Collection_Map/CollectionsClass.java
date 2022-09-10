package Collection_Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class CollectionsClass {

	public static void main(String[] args) {

		List<Integer> numList = new ArrayList<Integer>();
		numList.addAll(Arrays.asList(3, 30, 34, 5, 9));
		Collections.sort(numList, new sortComparator());
		for(Integer i : numList){
			System.out.print(i);
		}
	}
}

class sortComparator implements Comparator<Integer> {
	public int compare(Integer o1, Integer o2) {
		String a_o1 = o1.toString();
		String a_o2 = o2.toString();
		String a = a_o1+a_o2;
		String b = a_o2+a_o1;
		return b.compareTo(a);
	}
}
