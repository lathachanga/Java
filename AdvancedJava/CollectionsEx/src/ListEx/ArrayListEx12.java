package ListEx;

import java.util.ArrayList;

public class ArrayListEx12 extends ArrayList<Integer> {

	public static void main(String[] args) {
		
		ArrayListEx12 al = new ArrayListEx12();

		
		al.add(34);
		al.add(22);
		al.add(12);
		al.add(54);
		al.add(87);
		System.out.println(al);
		al.removeRange(1,4);
		System.out.println(al);
		
		  // remove all even numbers
        al.removeIf(e -> (e % 2) == 0);
        System.out.println("Odd Numbers: " + al);
	}

}
