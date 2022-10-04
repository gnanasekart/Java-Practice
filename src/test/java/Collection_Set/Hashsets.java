package Collection_Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Hashsets {

	public static void main(String[] args) {
		HashSet<String> hset = new HashSet<String>();
		
		hset.add("gnana");
		hset.add("sekar");
		hset.add("gowri");
		hset.add("gnana");
		hset.add("shankar");
		hset.add("kumar");
		hset.add("between");
		
		//hset.forEach(s -> System.out.print(s+" "));//1 2 3 5
		
		//Arraylist to Hashset
		
		List<String> list = new ArrayList<String>(hset);
		
		Set<String> set = new HashSet<String>(list);
		//set.forEach(ss -> System.out.println(ss+ " "));
		
		ArrayList<String> l = new ArrayList<String>(set);
		Collections.sort(l);
		//l.forEach(ll -> System.out.println(ll));
		
		//Hashset to treeset - it will automatically sort and return the order instead of sort method
		
		TreeSet<String> ts = new TreeSet<String>(hset);
		
		//ts.forEach(t -> System.out.println(t));
		
		//-------------------------------------------------
		
		int[] arr1 = {1, 3, 5, 7, 9, 3};
		int[] arr2 = {3, 5, 6, 7, 8};
		
		Set<Object> setArr1 = new HashSet<>(List.of(arr1));
		Set<Object> setArr2 = new HashSet<>(List.of(arr2));
		
		if(setArr1.size()!=setArr2.size())
			System.out.println("not same size");
		
		setArr1.forEach(s -> {
			if(setArr2.contains(s))
				System.out.println("available");
			else
				System.out.println("not available");
		});
	}
}