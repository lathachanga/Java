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
		Integer[] num=new Integer[al.size()];
		num=al.toArray(num);
		for(int a:num){
			System.out.println(a);
		}
	}
}
