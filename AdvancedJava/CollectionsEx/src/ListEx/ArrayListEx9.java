package ListEx;

import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListEx9 {

	public static void main(String[] args) {
	ArrayList<String>  al=new ArrayList<String>();
	al.ensureCapacity(3);  // // set the capacity of the arraylist
	al.add("Srilatha");
	al.add("Bujji");
	al.add("Pavan");
	
	System.out.println(al);
	
	al.add("Joshna");
	System.out.println(al);
	
	}

}
