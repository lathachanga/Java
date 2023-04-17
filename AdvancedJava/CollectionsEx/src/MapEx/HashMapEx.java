package MapEx;

import java.util.HashMap;

public class HashMapEx {

	public static void main(String[] args) {
	HashMap hs=	new HashMap();
	hs.put(101,"Srilatha");
	hs.put(102,"bujji");
	hs.put(103,"Pavan");
	hs.put(103,"Pavan Changa");
	hs.put(105,"Srilatha");
	hs.put(104,"Joshna");
	System.out.println(hs);
	System.out.println(hs.containsKey(103));  //true
	System.out.println(hs.containsKey(109));  //false
	System.out.println(hs.containsValue("Srilatha"));  //true
	System.out.println(hs.size()); // 5
	System.out.println(hs.values());  //[Srilatha,bujji,pavan changa ,joshna,Srilatha]
	System.out.println(hs.keySet());  //[101,102,103,104,105]
	System.out.println(hs.entrySet()); //[101=Srilatha , 102=bujji,103=pavan Changa ,104=joshna,105=Srilatha]
	
	for(Object ob:hs.values()) {
		System.out.println(ob);
	}
	
	for(Object ob:hs.keySet()) {
		System.out.println(ob);
	}
	
	for(Object ob:hs.entrySet()) {
		System.out.println(ob);
	}
	}

}
