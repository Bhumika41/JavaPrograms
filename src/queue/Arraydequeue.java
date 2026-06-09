package queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Arraydequeue {
	
	public static void main(String[] args) {

        Deque<Integer> dq = new ArrayDeque<>();

        dq.addFirst(20);
        dq.addFirst(10);

        dq.addLast(30);
        dq.addLast(40);

        System.out.println(dq);

        System.out.println("First : " + dq.peekFirst());
        System.out.println("Last  : " + dq.peekLast());

        dq.removeFirst();
        dq.removeLast();

        System.out.println(dq);
    }
}