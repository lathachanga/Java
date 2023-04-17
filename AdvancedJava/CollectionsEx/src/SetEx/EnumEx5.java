package SetEx;

import java.util.EnumSet;

import SetEx.EnumEx2.Size;

public class EnumEx5 {
    enum Size{
    	SMALL,MEDIUM,LARGE,EXTRALARGE
    }
	public static void main(String[] args) {
		
		  EnumSet<Size> ex= EnumSet.allOf(Size.class);
		     System.out.println(ex);
		
		   EnumSet<Size> ex1= EnumSet.noneOf(Size.class);
		     System.out.println(ex1);
		
          ex1.add(Size.MEDIUM);
          System.out.println(ex1);
          
          ex1.addAll(ex);
          System.out.println(ex1);System.out.println(ex1);
    
	}

}
