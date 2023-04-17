package ListEx;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx2 {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add("Joshna");
		ll.add(true);
		ll.add(null);
		ll.add(100);
		ll.add(10.8);
		ll.add(10);
		ll.add("Srilatha");
		ll.add(10);
		for(int i=0;i<=ll.size()-1;i++) {
		System.out.println(ll.get(i));
	    }
		for( Object obj:ll){
			System.out.println(obj);
		}
		Iterator it=ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
