package Collection_Set;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Navigableset {

	public static void main(String[] args) {
		
		NavigableSet<Integer> nset = new TreeSet<>();
		
		nset.add(1);
		nset.add(2);
		nset.add(2);
		nset.add(3);
		nset.add(4);
		nset.add(5);
		nset.add(6);
		nset.add(7);
		
		//nset.forEach(n -> System.out.println(n));
		
		
		System.out.println(nset.floor(4));//4
		
		System.out.println(nset.ceiling(4));//4
		
		System.out.println(nset.headSet(6));//[1,2,3,4,5]
		
		System.out.println(nset.lower(5));//4
		
		System.out.println(nset.pollFirst());//1
		
		System.out.println(nset.pollLast());//7
		
		System.out.println(nset.tailSet(4));//[4,5,6]
		
		System.out.println(nset.tailSet(4, false));
		//true - [4,5,6]
		//false - [5,6]
		
		System.out.println(nset.ceiling(4));//4
		
		Iterator<Integer> it = nset.descendingIterator(); 
		while(it.hasNext()) {
			//System.out.print(it.next()+" "); //6 5 4 3 2 
		}
		
		NavigableSet<Integer> its = nset.descendingSet(); 
		nset.forEach(n -> System.out.print(n+" "));
		its.forEach(a -> System.out.print(a));//65432
			
	}
}