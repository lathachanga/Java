package examples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SecondLargestNumberInArray {

	public static void main(String[] args) {
		int[] arr= {10,30,45,23,76,98,56,55};
		List<Integer> li=Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(li);
        
        //find the  largest number in array
        Integer list=Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).findFirst().get();
        System.out.println("largest number in array : "+list);
        //find the second largest number in array
        Integer list1=Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println("second largest number in array: "+list1);
        
        List<Integer> lis=Arrays.stream(arr).boxed().sorted().collect(Collectors.toList());
        System.out.println(lis);
        
        //find the  smallest number in array
        Integer list2=Arrays.stream(arr).boxed().sorted().findFirst().get();
        System.out.println("smallest number in array : "+list2);
        //find the second smallest number in array
        Integer list3=Arrays.stream(arr).boxed().sorted().skip(1).findFirst().get();
        System.out.println("second smallest number in array: "+list3);
        
	}

}
