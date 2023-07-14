package Collection.Collection_Map;

import java.util.NavigableMap;
import java.util.TreeMap;

public class Navigablemaps {

	public static void main(String[] args) {
		NavigableMap<Integer, String> sm = new TreeMap<Integer, String>();
		
		sm.put(4, "a");
		sm.put(7, "a");
		sm.put(1, "a");
		sm.put(3, "a");
		sm.put(2, "a");
		
		NavigableMap<Integer, String> nmap = sm.descendingMap();
		System.out.println(nmap);
		
		System.out.println(sm.floorKey(7));//7

		System.out.println(sm.floorEntry(3));//3=a
		
		System.out.println(sm.ceilingEntry(2));//2=a
		
		System.out.println(sm.pollFirstEntry());//1=a
		
		System.out.println(sm.pollLastEntry());//7=a
	}
}
