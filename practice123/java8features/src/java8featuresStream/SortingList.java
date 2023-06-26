package java8featuresStream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingList {

	public static void main(String[] args) {
		List<Integer> li=new ArrayList<>();
		li.add(22);
		li.add(32);
		li.add(20);
		li.add(10);
		
		Collections.sort(li);  //ascending
		Collections.reverse(li); //Descending
		System.out.println(li);
		
    li.stream().sorted().forEachOrdered(t->System.out.println(t));
    li.stream().sorted(Comparator.reverseOrder()).forEachOrdered(t->System.out.println(t));
	}

}
