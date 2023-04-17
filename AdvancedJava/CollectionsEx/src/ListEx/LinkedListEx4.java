package ListEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx4 {

	public static void main(String[] args) {
		
		LinkedList al=new LinkedList();
		al.add(1);
		al.add(true);
		al.add(null);
		al.add(10.8);
		al.add("Srilatha");
		al.add(10);
		System.out.println(al);
	
		
		
		LinkedList<String>  al1=new LinkedList<String>();
		al1.add("Srilatha");
		al1.add("Bujji");
		al1.add("Pavan");
		al1.add("Joshna");
		al1.add("Bujji");
		System.out.println(al1);
		Collections.sort(al1);
		System.out.println(al1);
		Collections.sort(al1,Collections.reverseOrder());
		System.out.println(al1);
		
		LinkedList<Integer>  l1=new LinkedList<Integer>();
		l1.add(45);
		l1.add(56);
		l1.add(76);
		l1.add(12);
		l1.add(90);
		System.out.println(l1);
		Collections.sort(l1);
		System.out.println(l1);
		Collections.sort(l1,Collections.reverseOrder());
		System.out.println(l1);
		
		}
	}


