package QueueEx;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueEx {

	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue();
		PriorityQueue pq1 = new PriorityQueue();
		pq.add(102);
		pq.add(103);
		pq.add(104);
		pq.add(105);
		pq.add(106);
		//System.out.println(pq);
		pq.offer(107);
		pq.offer(108);
		System.out.println(pq);
		
		//pq1.remove();
		//pq1.poll();
		//pq1.element();
		//pq1.peek();
		
		/*System.out.println( pq.remove());
		System.out.println(pq);*/
	/*	System.out.println( pq.poll());
		System.out.println(pq);*/
    	/*System.out.println( pq.element());
		System.out.println(pq);*/
		System.out.println(pq.peek());
		System.out.println(pq);
	}

}
//descendingIterator()	This method returns an iterator for the deque. The elements will be returned in order from last(tail) to first(head).
//iterator()	This method returns an iterator for the deque. The elements will be returned in order from first (head) to last (tail).
//offer(element)	This method is used to add an element at the tail of the queue. This method is preferable to add() method since this method does not throws an exception when the capacity of the container is full since it returns false.
//peek()	This method is used to retrieve the element at the head of the deque but doesn’t remove the element from the deque. This method returns null if the deque is empty.
//element()	This method is used to retrieve, but not remove, the head of the queue represented by this deque.
//poll()	This method is used to retrieve and remove the element at the head of the deque. This method returns null if the deque is empty.