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
		for(int i=0;i<al.size();i++){
			num[i]=al.get(i);
		}
		for(int a:num){
			System.out.println(a);
		}
	}
}
