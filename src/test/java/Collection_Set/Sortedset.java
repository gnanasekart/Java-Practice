package Collection_Set;

import java.util.SortedSet;
import java.util.Spliterator;
import java.util.TreeSet;

public class Sortedset {

	public static void main(String[] args) {
		SortedSet sset = new TreeSet();
		
		sset.add("gnana");
		sset.add("sekar");
		sset.add("gowri");
		sset.add("gnana");
		sset.add("shankar");
		sset.add("kumar");
		sset.add("between");
		
		//sset.forEach(a -> System.out.println(a));
		
		//System.out.println(sset.first());//between
		
		//System.out.println(sset.last());
		
		//System.out.println(sset.headSet("kumar"));
		
		//System.out.println(sset.tailSet("kumar"));
		
		System.out.println("----------------------------");
		
		// method may return null if the given set uses the natural ordering of the element.
		//System.out.println(sset.comparator());
		
		Spliterator object = sset.spliterator();
		
		//while(object.tryAdvance((n) -> System.out.println(n+" ")));
			
		System.out.println(object.getExactSizeIfKnown());//6
		
	}

}
