package java8;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class StreamTest {

	public static void main(String[] args) {
		List<Integer> li=Arrays.asList(32222,3423321,3333,3575665);
		
		OptionalDouble average=	li.stream().mapToInt(i->i*i).filter(i->i>10000).average();
		
		if(average.isPresent()) {
			System.out.println(average.getAsDouble());
		}

	}

}
