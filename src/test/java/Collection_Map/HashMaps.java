package Collection_Map;
import java.util.*;
import java.util.Map.Entry;

public class HashMaps 
{
	public static void main(String[] args)
	{
		HashMap<Integer, String> map = new HashMap<>();
		map.put(4, "gnana");
		map.put(2, "sekar");
		map.put(1, "gnana");
		map.put(3, "kumar");
		map.put(4, null);
		map.put(null, null);
		map.putIfAbsent(2, "sekar");

		HashMap<Integer, String> hmap = new HashMap<>(map);
		
		//System.out.println(map.equals(hmap));//true
		
		//System.out.println(map == hmap);//false
		
		//compute
//		map.compute(2, (k, v) -> "gnana ".concat(v));
//		
//		map.computeIfPresent(1, (k, v) -> v.concat(" sekar"));
//		
//		System.out.println(map.get(2));
//		
//		System.out.println(map);
//		
//		
//		map.forEach((k,v) -> System.out.println(k+" - "+v));
//
//		//map.remove(1);
//		map.equals(3);
//		map.replace(1, "guna");
//		map.replace(1, "guna", "gana");

//		System.out.println(map);//{null=null, 1=gana, 2=sekar, 3=kumar, 4=null}
//
//		System.out.println(map.get(1));//gana
//		System.out.println(map.getOrDefault(3, "gnanasekar"));//kumar
//		System.out.println(map.getOrDefault(6, "gnanasekar"));//gnanasekar
//		System.out.println(map.size());//5

		String[] s = {"a", "b", "c"};
		for(String ss: s) {
			System.out.println(ss);
		}
		
		
		for(Map.Entry m : map.entrySet())
		{
			if(map.containsKey(m.getKey()))
			System.out.println(m.getKey()+" : "+m.getValue());
		}
		
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

		map.entrySet()  
		//Returns a sequential Stream with this collection as its source  
		.stream()  
		//Sorted according to the provided Comparator  
		.sorted(Map.Entry.comparingByKey())  
		//Performs an action for each element of this stream  
		.forEach(System.out::println);  

		//Iterator
		Iterator<Entry<Integer, String>> entryset= map.entrySet().iterator();
		while(entryset.hasNext()) {
			Entry<Integer, String> key = entryset.next();
			System.out.println(key.getKey()+" "+key.getValue());
		}

		Iterator<Integer> entry = map.keySet().iterator();
		while(entry.hasNext()) {
			Integer key = entry.next();
			String value = map.get(key);
			System.out.println(key+ " - "+value);
		}

		if(map.containsKey(2)) map.put(map.size(), "newValue");
		else map.put(2, "oldValue");
		

		//map.forEach((k,v) -> System.out.println(k+" - "+v));

		//hmap.forEach((k,v) -> System.out.println(k+" - "+v));

		//System.out.println(hmap.keySet().equals(map.keySet()));

		//hashmap to hashset
		HashSet<String> hset = new HashSet<String>();
		ArrayList<Integer> list = new ArrayList<Integer>();

		for(Map.Entry m : map.entrySet()) {
			hset.add((String) m.getValue());
			list.add((Integer) m.getKey());
		}

		//hset.forEach(h -> System.out.println(h));
		//list.forEach(i -> System.out.println(i));		
	}
}