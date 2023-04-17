import java.io.*;
import java.util.*;
class Test{
	
	public static void main(String args[]){
		HashSet<String> al=new HashSet<String>();
		al.add("10");
		al.add("20");
		al.add("30");
		al.add("40");
		al.add("50");
		al.add("60");
		System.out.println(al);
		String[] arr=new String[al.size()];
		al.toArray(arr);
		for(String s:arr){
			System.out.println(s);
		}
	}
}