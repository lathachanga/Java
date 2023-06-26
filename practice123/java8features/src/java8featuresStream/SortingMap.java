package java8featuresStream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortingMap {

	public static void main(String[] args) {
		
		Map<String,Integer> m=new HashMap<>();
		m.put("six", 6);
		m.put("eigth", 8);
		m.put("two", 2);
		m.put("four", 4);
		
		List<Entry<String,Integer>> li=new ArrayList<>(m.entrySet());
		
		//Collections.sort(li, new Comparator<Entry<String,Integer>>());
		
		//m.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		m.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

	}

}
