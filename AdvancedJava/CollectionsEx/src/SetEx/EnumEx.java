package SetEx;

import java.util.EnumSet;

public class EnumEx {
    enum Size{
    	SMALL,MEDIUM,LARGE,EXTRALARGE
    }
	public static void main(String[] args) {
		
     EnumSet<Size> ex= EnumSet.allOf(Size.class);
     System.out.println(ex);
	}

}
