
package SetEx;

import java.util.HashSet;

public class HashSetEx3 {

	public static void main(String[] args) {
	HashSet	hs=new HashSet(100,0.5f);
	//default fill ratio/ Load Factor:0.75f
    // initial capacity:16
	hs.add(130);
	hs.add(240);
	hs.add(202);
	hs.add(204);
	hs.add(210);
	hs.add(420);
	hs.add(320);
	System.out.println(hs);
	//Collections.sort(hs);//data Structures concept like sorting,shuffling are not applicable to hashset.
	}

}
