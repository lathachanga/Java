package SetEx;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumEx7 {
    enum Size{
    	SMALL,MEDIUM,LARGE,EXTRALARGE
    }
	public static void main(String[] args) {
		
		  EnumSet<Size> ex= EnumSet.allOf(Size.class);
		     System.out.println(ex);
		
	     Iterator itr=  ex.iterator();
		
     while(itr.hasNext()) {
    	 System.out.println(itr.next());
     } 
    
	}

}
