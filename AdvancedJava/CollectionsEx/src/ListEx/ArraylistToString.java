package ListEx;

import java.util.ArrayList;

public class ArraylistToString {

	public static void main(String[] args) {
		ArrayList<String>  al=new ArrayList<String>();
		al.add("Srilatha");
		al.add("Bujji");
		al.add("Pavan");
		al.add("Joshna");
		
		String name=al.toString();
		System.out.println(name);
	}

}
