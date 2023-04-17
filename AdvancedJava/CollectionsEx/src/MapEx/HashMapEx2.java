package MapEx;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapEx2 {

	public static void main(String[] args) {
	HashMap hs=	new HashMap();
	hs.put(101,"Srilatha");
	hs.put(102,"bujji");
	hs.put(103,"Pavan");
	hs.put(103,"Pavan Changa");
	hs.put(105,"Srilatha");
	hs.put(104,"Joshna");
   
	System.out.println(hs.get(102)); // bujji
	System.out.println(hs.get(108)); //null
	for(Object ob:hs.keySet()) {
		System.out.println(hs.get(ob));
	}
	for(Object ob:hs.entrySet()) {
			System.out.println(ob);
    }
	System.out.println(hs.entrySet());
	 Iterator it=hs.entrySet().iterator();
	 while(it.hasNext()) {
		//System.out.println( it.next());
		 Map.Entry	en =(Entry)it.next();
			//System.out.println( en.getKey());
			System.out.println("Employee Id:"+ en.getKey()+"  Employee Name:"+en.getValue());
	 }
	 System.out.println(hs);
	 System.out.println(hs.remove(105));
	 System.out.println(hs);
	 hs.clear();
	 System.out.println(hs);
	
	}

}
