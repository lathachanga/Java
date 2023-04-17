package SetEx;

import java.util.EnumSet;

public class EnumEx3 {
    enum Size{
    	SMALL,MEDIUM,LARGE,EXTRALARGE
    }
	public static void main(String[] args) {
		
     EnumSet<Size> ex= EnumSet.range(Size.MEDIUM,Size.EXTRALARGE);
     System.out.println(ex);
	}

}
