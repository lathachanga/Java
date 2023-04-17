package ListEx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx3 {

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
			
			LinkedList al2=new LinkedList();
			al2.add(100);
			al2.add(true);
			al2.add(null);
			al2.add(10.8);
			al2.add("Srilatha");
			al2.add(1);
			System.out.println(al2);
			
			
			List a=new LinkedList();
			a.addAll(al);
			a.addAll(al1);
			a.addAll(al2);
			System.out.println(a);
		}
	}


