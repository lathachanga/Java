package ListEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListEx5 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(1);
		al.add(true);
		al.add(null);
		al.add(10.8);
		al.add("Srilatha");
		al.add(10);
		System.out.println(al);
	
		
		
		ArrayList<String>  al1=new ArrayList<String>();
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
		
		
		
		}
	

}
