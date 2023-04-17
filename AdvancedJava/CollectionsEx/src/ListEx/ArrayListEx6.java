package ListEx;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx6 {

	public static void main(String[] args) {
		
		ArrayList<Integer>  al1=new ArrayList<Integer>();
		al1.add(45);
		al1.add(56);
		al1.add(76);
		al1.add(12);
		al1.add(90);
		System.out.println(al1);
		Collections.sort(al1);
		System.out.println(al1);
		Collections.sort(al1,Collections.reverseOrder());
		System.out.println(al1);
		
		
		
		}
	

}
