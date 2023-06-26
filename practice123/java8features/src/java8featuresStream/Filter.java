package java8featuresStream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Filter {

	public static void main(String[] args) {
		List<String> li=new ArrayList<>();
		li.add("mango");
		li.add("pink");
		li.add("apple");
		li.add("monky");
		
		for(String s:li) {
		     if(s.startsWith("m")) {
		    	 System.out.println(s);
		     }
			
		}
		
		//li.stream().filter(t->t.startsWith("m")).forEach(t->System.out.println(t));
		
		
		Map<Integer, String> m=new HashMap<>();
		m.put(1, "pandu");
		m.put(2, "pinky");
		m.put(3, "chinnu");
		m.put(4, "bunny");
		
		//m.forEach((key,value)->{System.out.println(key+":"+value);});
		
	 //  m.entrySet().filter(k->k.getKey()%2==0).forEach(t->System.out.println(t));
		
	   m.entrySet().stream().filter(k->k.getKey()%2==0) .forEach(t->System.out.println(t));
	}

}
