package DateAndTime;

import java.time.Year;

public class Test {

	public static void main(String[] args) {
		int y=2024;
		if(Year.isLeap(y)) {
			System.out.println("Yes,it is leap year");
		}
		else {
			System.out.println("No,it is not leap year");
		}

	}

}
