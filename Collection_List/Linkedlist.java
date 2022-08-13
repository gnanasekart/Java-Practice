package Collection_List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linkedlist {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<>();

		LinkedList<String> emptylist = new LinkedList<>();

		list.add("gnana");
		list.add("sekar");
		list.add("gowri");
		list.add("shankar");

		list.addFirst("T");
		list.addLast("t");
		/*
		//Retrieve but does not remove
		System.out.println(list.element());//T
		System.out.println(list.getFirst());//T
		System.out.println(list.getLast());//t

		System.out.println(emptylist.getFirst());//if no element means return nosuchelementexception

		System.out.println(list.lastIndexOf("tgs"));//6

		//insert
		list.offer("tgs");//insert in last of the list
		list.offerFirst("firstoffer");//insert in first position
		list.offerLast("offerlast");//insert in last position

		System.out.println(list.peek());
		System.out.println(list.peekFirst());
		System.out.println(list.peekLast());

		System.out.println(emptylist.peek());//if no element means return null

		list.forEach(a -> System.out.println(a));
		
		System.out.println("-------------------------------------");
		list.poll();//remove first element
		list.pollFirst();
		list.pollLast();
		
		//System.out.println(emptylist.pollFirst());//null

		list.forEach(a -> System.out.println(a));
		
		// removes and returns the first element of this list
		list.pop();
		
		
		list.push("pushfirst");//inserts the element at the front of this list
		
		//list.forEach(a -> System.out.println(a));
		
		list.set(0, "setvalue");
		
		list.forEach(a -> System.out.println(a));
		*/
		
		list.forEach(a -> System.out.println(a));
		
		// elements will be returned in order from last (tail) to first (head)
		Iterator it = list.descendingIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

}
