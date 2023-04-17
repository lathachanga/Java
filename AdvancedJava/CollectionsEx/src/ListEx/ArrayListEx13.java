package ListEx;

import java.util.ArrayList;

public class ArrayListEx13 {

	public static void main(String[] args) {
		
		ArrayList<String>  al=new ArrayList<String>();
		
		al.add("Srilatha");
		al.add("Bujji");
		al.add("Pavan");
		
		System.out.println(al);
		   // replace all elements to uppercase
        al.replaceAll(e -> e.toUpperCase());
        System.out.println("Updated ArrayList: " + al);
	}

}
