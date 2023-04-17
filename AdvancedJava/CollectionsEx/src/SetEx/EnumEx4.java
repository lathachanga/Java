package SetEx;

import java.util.EnumSet;

public class EnumEx4 {
    enum Size{
    	SMALL,MEDIUM,LARGE,EXTRALARGE
    }
	public static void main(String[] args) {
		
     EnumSet<Size> ex= EnumSet.of(Size.MEDIUM);
     System.out.println(ex);
     
     EnumSet<Size> ex1= EnumSet.of(Size.MEDIUM,Size.EXTRALARGE);
     System.out.println(ex1);
	}

}
