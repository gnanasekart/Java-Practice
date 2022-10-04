package Collection_Queue;

import java.util.PriorityQueue;
import java.util.Queue;
public class Queues {

	public static void main(String[] args) {
		Queue<String> q = new PriorityQueue<String>();
		
		//FIFO
		q.add("g"); //<--- last
		q.add("i");
		q.add("u");
		q.add("l");
		q.add("a");//<--- first
		
		System.out.println(q.element());//a
		
		System.out.println(q.offer("u"));//true
		
		System.out.println(q.peek());//a
		
		System.out.println(q.poll());//a
		
		System.out.println(q.remove());//g
		
		System.out.println(q);//[i, l, u, u]

	}

}
