
package SetEx;

import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {
	HashSet	hs=new HashSet();
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
	}

}
