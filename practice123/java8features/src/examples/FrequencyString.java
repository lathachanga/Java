package examples;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyString {

	public static void main(String[] args) {
		String name="changasrilatha";
		String[] result=name.split("");
		System.out.println(Arrays.toString(result));
		Map<Object, List<String>> map=Arrays.stream(result).collect(Collectors.groupingBy(s->s));
        System.out.println(map);
        
       //Occurrence   of each letter
       Map<String, Long> map1= Arrays.stream(name.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
       System.out.println(map1);
       
       //finding duplicates of a string
       List<String> duplicateElement=  Arrays.stream(name.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
    		                               .entrySet().stream()
    		                               .filter(x->x.getValue()>1)
    		                               .map(Map.Entry::getKey)
    		                               .collect(Collectors.toList());
       System.out.println(duplicateElement);
       
       //finding unique elements
       List<String> uniqueElement=  Arrays.stream(name.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
               .entrySet().stream()
               .filter(x->x.getValue()==1)
               .map(Map.Entry::getKey)
               .collect(Collectors.toList());
       System.out.println(uniqueElement);
       
     /*  Optional<String> firstNonRepeatingElement1=  Arrays.stream(name.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
               .entrySet().stream()
               .filter(x->x.getValue()==1)
               .map(Map.Entry::getKey).findFirst();
              // .collect(Collectors.toList()).findFirst();
       System.out.println(firstNonRepeatingElement1.get());*/
       
       
       // first non repeating element in a string
      String  firstNonRepeatingElement=  Arrays.stream(name.split("")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
               .entrySet().stream()
               .filter(x->x.getValue()==1)
               .findFirst().get().getKey();
              // .collect(Collectors.toList()).findFirst();
       System.out.println(firstNonRepeatingElement);
       
       // first  repeating element in a string
       String  firstRepeatingElement=  Arrays.stream(name.split("")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
               .entrySet().stream()
               .filter(x->x.getValue()>1)
               .findFirst().get().getKey();
              // .collect(Collectors.toList()).findFirst();
       System.out.println(firstRepeatingElement);
	}

}
