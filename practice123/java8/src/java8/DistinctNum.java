package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctNum {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(10,30,50,10,30,20,50,10);
		list.stream().distinct().forEach(System.out::println);
		List<Integer>  num=list.stream().distinct().collect(Collectors.toList());
		System.out.println(num);
		
	}

}
