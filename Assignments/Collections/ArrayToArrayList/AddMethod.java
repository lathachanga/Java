import java.util.*;
class Test{
	public static void main(String args[]){
		String[] names={"Srilatha","Sandhya","Manasa","Usha","Joshna","Sowmya"};
		List<String> al= new ArrayList<String>();
		for(String st:names){
			al.add(st);
		}
		System.out.println(al);
		al.add("Monica");  
		al.add("manasa");
		System.out.println(al);
	}
}