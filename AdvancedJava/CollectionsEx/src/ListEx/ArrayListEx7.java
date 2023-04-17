package ListEx;

import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListEx7 {

	public static void main(String[] args) {
	ArrayList<String>  al=new ArrayList<String>();
	al.add("Srilatha");
	al.add("Bujji");
	al.add("Pavan");
	al.add("Joshna");
	System.out.println(al);
	System.out.println("SubList:"+al.subList(1, 3));  //subList
	al.sort(Comparator.naturalOrder());
	System.out.println(al);
	ArrayList<String> clone=(ArrayList<String>)al.clone();
	System.out.println(clone);
	
	
	}

}
