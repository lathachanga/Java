package java8;

import java.util.Arrays;
import java.util.List;

public class findNumStartWith1 {

	public static void main(String[] args) {

         List<Integer> l=Arrays.asList(10,30,40,18,16,45,13);
         
         l.stream().map(s->s+"").filter(i->i.startsWith("1")).forEach(System.out::println);
    
	}

}
