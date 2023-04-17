package SortedSet;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetEX {

	public static void main(String[] args) {
        SortedSet<Integer> ss=new	TreeSet<>();
         ss.add(23);
         ss.add(12);
         ss.add(65);
         ss.add(43);
         System.out.println("First Element is:"+ss.first());
         System.out.println("Last Element is:"+ss.last());
         System.out.println("Removed Element is:"+ss.remove(12));
         
	}

}
