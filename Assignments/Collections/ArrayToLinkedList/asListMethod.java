import java.util.*;
class Test{
	public static void main(String args[]){
		String[] names={"Srilatha","Bujji","Pavan","Kasibabu","Suseela"};
		List<String> al=Arrays.asList(names);
		LinkedList<String> ll=new LinkedList<String>(al);
		System.out.println(ll);
		
	}
}