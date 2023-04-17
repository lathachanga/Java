import java.io.*;
import java.util.*;
class Test{
	public static void main(String args[]){
		List<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		Object[] obj=al.toArray();
		for(Object ele:obj){
			System.out.println(ele);
		}
	}
}
