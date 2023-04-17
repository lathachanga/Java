package SetEx;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class LinkedHashSetEX {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(45);
        al.add(67);
        al.add(89);
        al.add(32);
        System.out.println(al);
        LinkedHashSet<Integer>  ll=new LinkedHashSet<Integer>(al);
        System.out.println(ll);
	}

}
