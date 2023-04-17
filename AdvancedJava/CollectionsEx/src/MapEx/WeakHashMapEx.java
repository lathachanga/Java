package MapEx;

import java.util.WeakHashMap;

public class WeakHashMapEx {

	public static void main(String[] args) {
		WeakHashMap<String ,Integer> hm =new WeakHashMap<>();
		String two=new String("TWOO");
		Integer twoValue=2;
		String four=new String("four");
		Integer fourValue=4;
		hm.put(two, twoValue);
		hm.put(four, fourValue);
		System.out.println("WeakHashMap:"+hm);
		
		two=null;
		System.gc();
		System.out.println("WeakHashMap after garbage collection: "+hm);

	}

}
