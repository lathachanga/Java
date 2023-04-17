import java.util.*;
import java.io.*;
class Hashset{
	static Set<Integer> convert(int[] array){
		Set<Integer> st=new HashSet<>();
		for(int ele:array){
			st.add(ele);
		}
		return st;
	}
	static void print(Set<Integer> ele){
	       Iterator it  = ele.iterator();
		   while(it.hasNext()){
			   System.out.println(it.next());
		   }
	}
	public static void main(String args[]){
		int[] arr={10,20,30,40,50};
		Set<Integer> num=convert(arr);
		print(num);
	}
}
