import java.util.*;
class Test{
	public static void main(String args[]){
		String[] names={"Srilatha","Sandhya","Manasa","Usha","Joshna","Sowmya"};
		List al=Arrays.asList(names);
		System.out.println(al);
		al.add("Monica");
		al.add("manasa");
		System.out.println(al);
	}
}