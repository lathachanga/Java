package SetEx;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumEx6 {
    enum Size{
    	SMALL,MEDIUM,LARGE,EXTRALARGE
    }
	public static void main(String[] args) {
		
		  EnumSet<Size> ex= EnumSet.allOf(Size.class);
		     System.out.println(ex);
		
		     // Using remove()
		        boolean value1 =ex.remove(Size.MEDIUM);
		        System.out.println("Is MEDIUM removed? " + value1);

		        // Using removeAll()
		        boolean value2 = ex.removeAll(ex);
		        System.out.println("Are all elements removed? " + value2);
    
	}

}
