package ListEx;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
          ll.add(102);
          ll.add(103);
          ll.add(104);
          ll.add(105);
          System.out.println(ll);
          ll.addFirst(101);
          ll.addLast(106);
          System.out.println(ll);
          System.out.println(ll.contains(105));
          System.out.println(ll.isEmpty());
          System.out.println(ll.size());
          System.out.println(ll.get(0));
  		  System.out.println(ll.get(1));
  		  System.out.println(ll.get(2));
  		  System.out.println(ll.get(3));
  		System.out.println(ll.getFirst());
  		System.out.println(ll.getLast());
  		  System.out.println(ll);
  		System.out.println(ll.set(0,"Sowmya"));
		System.out.println(ll.set(1,"Manasa"));
		System.out.println(ll.set(2,"Sandhya"));
		System.out.println(ll);
		System.out.println(ll.remove(0));
		System.out.println(ll);
	}

}
