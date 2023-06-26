package Collection.Collection_Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Arraydeques {

	public static void main(String[] args) {
		Deque<String> q = new ArrayDeque<String>();
		q.add("g"); //<--- last
		q.add("i");
		q.add("u");
		q.add("l");
		q.add("a");//<--- first
	
		System.out.println(q.element());//g
		
		System.out.println(q.offer("u"));//true
		
		System.out.println(q.peek());//g
		
		System.out.println(q.poll());//g
		
		System.out.println(q.remove());//i
		
		System.out.println(q.getFirst());//u
		
		System.out.println(q.getLast());//u
		
		System.out.println(q.offerFirst("1"));//
		
		System.out.println(q.offerLast("h"));
		
		System.out.println(q.peekFirst());//1
		
		System.out.println(q.peekLast());//h
		
		System.out.println(q.pollFirst());//1
		
		System.out.println(q.pollLast());//h
		
		System.out.println(q.pop());//u
		
		System.out.println(q.removeLastOccurrence(q));//false
		
		System.out.println(q);//[l, a, u]
	}

}
