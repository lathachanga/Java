
package SetEx;

import java.util.HashSet;

public class HashSetEx4 {

	public static void main(String[] args) {
	HashSet set1=new HashSet();
	HashSet set2=new HashSet();
	set1.add(1);
	set1.add(2);
	set1.add(3);
	set1.add(4);
	set1.add(5);
	
	set2.add(3);
	set2.add(4);
	set2.add(5);
	set2.add(6);
	set2.add(7);
	//System.out.println(set1);
	//System.out.println(set2);
	
	/*set1.addAll(set2);//union operation 
	System.out.println(set1);
	
	set2.addAll(set1);
	System.out.println(set2);*/
	
	/*set1.retainAll(set2); //difference 
	System.out.println(set1);*/         //[3,4,5]
	
	/*set2.retainAll(set1); //difference 
	System.out.println(set2);*/         //[3,4,5]
	
	
	/*set1.removeAll(set2);
	System.out.println(set1);*/       //[1,2]
	
	set2.removeAll(set1);
	System.out.println(set2);        //[6,7]
	
	//removeAll(collection)	This method is used to remove all the elements from the collection which are present in the set. This method returns true if this set changed as a result of the call.
	//retainAll(collection)	This method is used to retain all the elements from the set which are mentioned in the given collection. This method returns true if this set changed as a result of the call.
	
	
	}

}
