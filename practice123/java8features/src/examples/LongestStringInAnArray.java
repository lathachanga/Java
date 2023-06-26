package examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LongestStringInAnArray {

	public static void main(String[] args) {
	  String[] st= {"java","springboot","javascript","Reactjs","changasrilatha"};
	  
	  // find the longest string in an given array
	  String length=Arrays.stream(st).reduce((a,b)->a.length()>b.length()?a:b).get();
     System.out.println(length);
     
     // to find all the numbers  from array who start with 1
     int[] num= {2,45,11,56,91,34,13,43,49};
     Arrays.stream(num).boxed().map(s->s+"").filter(s->s.startsWith("1")).forEach(System.out::println);
     
     List<String> li=Arrays.stream(num).boxed().map(s->s+"").filter(s->s.startsWith("1")).collect(Collectors.toList());
     System.out.println(li);
     
     List<String> lis=Arrays.stream(num).boxed().map(s->s+"").filter(s->s.startsWith("4")).collect(Collectors.toList());
     System.out.println(lis);
     
     
     //string.join method
      List<String> nos= Arrays.asList("1","2","3","4");
      String result=String.join("-", nos);
      System.out.println(result);
      
      
      //skip &limit example(2-9)
      
      IntStream.rangeClosed(1,10)
              .skip(1)
              .limit(8)
              .forEach(System.out::println);
      
      
      //sort a list and map
      
      //map() & flatMap() example
	}

}
