package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateNum {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(10,30,50,10,30,20,50,10);
		Set<Integer> set=list.stream().filter(i->Collections.frequency(list, i)>1).collect(Collectors.toSet());
           System.out.println(set);
	}

}
