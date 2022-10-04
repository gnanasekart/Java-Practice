package Collection_Map;

import java.util.Comparator;
import java.util.TreeMap;

public class Treemap {

	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<>(new MyComarator());

		map.put(4, "gnana");
		map.put(2, "sekar");
		map.put(1, "gnana");
		map.put(3, "kumar");
		map.put(4, null);
		//map.put(null, null);
		map.putIfAbsent(2, "sekar");

		System.out.println(map);
	}
}

class MyComarator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String one = o1.toString();
		String two = o2.toString();
		//return one.compareTo(two);//Ascending order
		return -one.compareTo(two);//Descending order
	}
}