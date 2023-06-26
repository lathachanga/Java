package practice;

public class String1 {

	public static void main(String[] args) {
		String s="Srilatha";  //----1010
		s.concat("Changa");    // ----1020
		//concat method method append the string in the end
		System.out.println(s); // 0/p:  java   // will print java because strings are mutable objects
		
		
		String pwd="password";
		pwd.concat("123");
		System.out.println(pwd);
		
		//lets say 5 references using this password, if u changed any in same value then all 5 references will impacted
    
		StringBuilder sb=new StringBuilder("Srilatha");
		sb.append("Changa");
		System.out.println(sb); //SrilathaChanga
		
		
		StringBuffer sv=new StringBuffer("Srilatha");
		sv.append("Changa");
		System.out.println(sv); //SrilathaChanga
		
	}

}
