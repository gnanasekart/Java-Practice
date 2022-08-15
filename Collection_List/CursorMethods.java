package Collection_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CursorMethods {

	public static void main(String[] args) {

		Vector<String> v = new Vector<String>();
		Enumeration<String> en = v.elements();

		v.add("a");
		v.add("v");
		v.add("e");

		while(en.hasMoreElements()) {
			System.out.print(en.nextElement());
		}

		System.out.println(v);

		//-------------------------------
		
		ArrayList<String> list = new ArrayList<String>(Arrays.asList("A", "F", "R", "T"));

		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

		ListIterator<String> ll = list.listIterator();
		while(ll.hasNext()) {
			
			ll.add("z");
			System.out.print(ll.next()); // A F R T
			System.out.println(" "+ll.nextIndex()); // 1 2 3 4
		}

		while(ll.hasPrevious()) {
			System.out.print(ll.previous()); // T R F A
			System.out.println(" "+ll.previousIndex());//2 1 0 -1
		}
	}
}