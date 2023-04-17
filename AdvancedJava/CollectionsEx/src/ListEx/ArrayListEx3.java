package ListEx;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx3 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		ArrayList<String>  al1=new ArrayList<String>();
		al1.add("Srilatha");
		al1.add("Bujji");
		al1.add("Pavan");
		al1.add("Joshna");
		al1.add("Bujji");
		al1.add("Pavan");
		al1.add("Sandhya");
		al1.add("Usha");
		al1.add("Manasa");
		al1.add("Srilatha");
		
		al.add(1);
		al.add(2);
		al.add(3);
		al.add("Joshna");
		al.add(true);
		al.add(null);
		al.add(100);
		al.add(10.8);
		al.add(10);
		al.add("Srilatha");
		al.add(10);
		/*for(int i=0;i<=al.size()-1;i++) {
		System.out.println(al.get(i));
	    }
		for( Object obj:al){
			System.out.println(obj);
		}*/
		Iterator it=al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		/*for(int i=0;i<=al1.size()-1;i++) {
			System.out.println(al1.get(i));
		}
		for( String str:al1){
			System.out.println(str);
		}
		Iterator it=al1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}*/
			
		}
	

}
