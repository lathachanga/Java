import java.util.*;
class Test{
	public static void main(String args[]){
		String[] names={"Srilatha","Sandhya","Manasa","Usha","Joshna","Sowmya"};
		List<String> al= new ArrayList<String>();
		Collections.addAll(al,names);
		System.out.println(al);
		al.add("Monica");  
		al.add("manasa");
		System.out.println(al);
	}
}