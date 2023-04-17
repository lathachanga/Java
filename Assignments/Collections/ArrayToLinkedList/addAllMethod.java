import java.util.*;
class Test{
	public static void main(String args[]){
		String[] names={"Srilatha","Bujji","Pavan","Kasibabu","Suseela"};
		
		LinkedList<String> ll=new LinkedList<String>();
		Collections.addAll(ll,names);
		System.out.println(ll);
		
	}
}