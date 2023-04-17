package SetEx;

import java.util.EnumSet;

public class EnumEx2 {
    enum Size{
    	SMALL,MEDIUM,LARGE,EXTRALARGE
    }
	public static void main(String[] args) {
		
     EnumSet<Size> ex= EnumSet.noneOf(Size.class);
     System.out.println(ex);
	}

}
