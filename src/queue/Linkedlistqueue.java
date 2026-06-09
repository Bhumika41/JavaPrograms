package queue;


import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Linkedlistqueue {

	public static void main(String[] args) {
		 Queue<String> queue = new LinkedList<>();

	        queue.add("A");
	        queue.add("B");
	        queue.add("C");
	        queue.add(null);

	        System.out.println(queue);

	        System.out.println(queue.poll());

	        System.out.println(queue);

	        System.out.println(queue.peek());

	        
	        
	        
	}

}