package ListEx;

import java.util.ArrayList;

public class ArrayListEx2 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		ArrayList<String>  al1=new ArrayList<String>();
		al1.add("Srilatha");
		al1.add("Bujji");
		al1.add("Pavan");
		al1.add("Joshna");
		System.out.println(al);
		System.out.println(al1);
		System.out.println(al1.size());
		System.out.println(al1.isEmpty());
		System.out.println(al1.contains("Joshna"));
		/*System.out.println(al1.get(0));
		System.out.println(al1.get(1));
		System.out.println(al1.get(2));
		System.out.println(al1.get(3));
		System.out.println(al1);*/
		
		System.out.println(al1.set(0,"Sowmya"));
		System.out.println(al1.set(1,"Manasa"));
		System.out.println(al1.set(2,"Sandhya"));
		System.out.println(al1);
		System.out.println(al1.remove(0));
		System.out.println(al1);
	
		
	}

}
