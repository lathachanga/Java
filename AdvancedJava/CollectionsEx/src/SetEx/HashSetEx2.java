
package SetEx;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx2 {

	public static void main(String[] args) {
	HashSet	hs=new HashSet(100,0.5f);
	//default fill ratio/ Load Factor:0.75f
    // initial capacity:16
	hs.add(10);
	hs.add(20);
	hs.add(20);
	hs.add("Srilatha");
	hs.add(10.67f);
	hs.add(null);
	hs.add("Bujji");
	hs.add(null);

	System.out.println(hs);
	for(Object ob:hs) {
		System.out.println(ob);
	}
	Iterator it=hs.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	}

}
