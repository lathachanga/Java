import java.io.*;
import java.util.*;
class Test{
	public static <T> Object[] convert(LinkedList<T> ll){
		Object[] obj=ll.toArray();
		return obj;
	}
	public static void main(String args[]){
		LinkedList<String> al=new LinkedList<String>();
		al.add("10");
		al.add("20");
		al.add("30");
		al.add("40");
		al.add("50");
		al.add("60");
		System.out.println(al);
		Object[] obj=convert(al);
		String[] arr=Arrays.copyOf(obj,obj.length,String[].class);
		System.out.println("Array is:"+Arrays.toString(arr));
	}
}