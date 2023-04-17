package ListEx;

import java.util.ArrayList;

public class ArrayListEx11 {

	public static void main(String[] args) {
		
		ArrayList<String>  al=new ArrayList<String>();
		
		al.add("Srilatha");
		al.add("Bujji");
		al.add("Pavan");
		
		System.out.println(al);
		al.trimToSize();
		System.out.println(al.size());
	}

}
