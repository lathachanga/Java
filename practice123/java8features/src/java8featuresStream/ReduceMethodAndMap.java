package java8featuresStream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceMethodAndMap {

	public static void main(String[] args) {
		
		List<Integer> li=Arrays.asList(12,34,1,6,9,5);
		
		List<String> words=Arrays.asList("java","springboot","React","Javascript");
		
		int sum=0;
		for(int n:li) {
			sum=sum+n;
		}
		System.out.println(sum);
		
	int num=li.stream().mapToInt(i->i).sum();
	System.out.println(num);
	
	int num1=li.stream().reduce(0, (a,b)->a+b);
	System.out.println(num1);
	
	Optional<Integer> num2=li.stream().reduce(Integer::sum);
	System.out.println(num2.get());
	
	int mul=li.stream().reduce(1, (a,b)->a*b);
	System.out.println(mul);
	
	int max=li.stream().reduce(1, (a,b)->a>b?a:b);
	System.out.println(max);
	
	Optional<Integer> max1=li.stream().reduce(Integer::max);
	System.out.println(max1.get());
	
	
	Optional<String> wordsMax=words.stream().reduce((word1,word2)->word1.length()>word2.length()?word1:word2);
	System.out.println(wordsMax.get());
	}

}
