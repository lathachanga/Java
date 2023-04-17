package ListEx;

import java.util.ArrayList;

public class ArraylistToArray {

	public static void main(String[] args) {
		ArrayList<String>  al=new ArrayList<String>();
		al.add("Srilatha");
		al.add("Bujji");
		al.add("Pavan");
		al.add("Joshna");
		String[] arr=new String[al.size()];
		al.toArray(arr);
		for(String name:arr) {
			System.out.println(name);
		}
	}

}
