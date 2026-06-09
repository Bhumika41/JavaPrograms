package queue;

import java.util.*;
public class Priorityqueue {

	public static void main(String[] args) {
		Queue<Integer> pq = new PriorityQueue<>();
		

		pq.add(50);
		pq.add(10);
		pq.add(30);
		pq.add(20);
		System.out.println("Min Heap");
		while(!pq.isEmpty())
		{
		    System.out.println(pq.poll());
		}

		System.out.println("Max Heap");
		PriorityQueue<Integer> pq1 =
        	    new PriorityQueue<>(Collections.reverseOrder());

        	pq1.add(10);
        	pq1.add(50);
        	pq1.add(20);
        	while(!pq1.isEmpty())
    		{
        		System.out.println(pq1.poll());
    		}

	}

}
