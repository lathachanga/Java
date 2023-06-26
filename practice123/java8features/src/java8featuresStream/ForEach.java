package java8featuresStream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEach {

	public static void main(String[] args) {
		List<String> li=new ArrayList<>();
		li.add("mango");
		li.add("pink");
		li.add("apple");
		li.add("grapes");
		
//		for(String s:li) {
//			System.out.println(s);
//		}
		
		li.stream().forEach(t->System.out.println(t));
		
		
		Map<Integer, String> m=new HashMap<>();
		m.put(1, "pandu");
		m.put(2, "pinky");
		m.put(3, "chinnu");
		m.put(4, "bunny");
		
		m.forEach((key,value)->{System.out.println(key+":"+value);});
		
		m.entrySet().forEach(t->System.out.println(t));
		

	}

}
