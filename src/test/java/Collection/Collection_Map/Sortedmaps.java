package Collection.Collection_Map;

import java.util.SortedMap;
import java.util.TreeMap;

public class Sortedmaps {

	public static void main(String[] args) {
		SortedMap<Integer, String> sm = new TreeMap<>(); 
		
		sm.put(4, "a");
		sm.put(7, "a");
		sm.put(1, "a");
		sm.put(3, "a");
		sm.put(2, "a");
		
		System.out.println(sm.firstKey());//1
		
		System.out.println(sm.values());//[a,a,a,a,a]
		
		System.out.println(sm.headMap(3));//{1=a, 2=a}
		
		System.out.println(sm.tailMap(3));//{3=a, 4=a, 7=a}
		
		System.out.println(sm.compute(1, (k, v) -> v.toUpperCase()));//A
		
		System.out.println(sm.containsValue("b"));//false
		
		System.out.println(sm.computeIfPresent(2, (k, v) -> v.replace("a", "aa")));//aa
		
	}

}
