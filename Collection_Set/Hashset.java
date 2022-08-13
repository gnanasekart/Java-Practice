package Collection_Set;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Hashset {

	public static void main(String[] args) {
		HashSet hset = new HashSet();
		hset.add(5);
		hset.add(3);
		hset.add(1);
		hset.add(2);
		hset.add(2);
		hset.add(5);
		
		//hset.forEach(s -> System.out.print(s+" "));//1 2 3 5
		
		List list = new ArrayList();
		list.add(5);
		list.add(3);
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(5);
		
		Set set = new HashSet(list);
		//set.forEach(ss -> System.out.println(ss+ " "));
		
		ArrayList l = new ArrayList(set);
		l.forEach(ll -> System.out.println(ll));
		
	}

}
