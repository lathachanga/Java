package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIEx2 {

	public static void main(String[] args) {
     Stream s=Stream.of(2,3,4,5,6);
     Object[] arr=s.toArray();
     for(Object a:arr) {
    	 System.out.println(a);
     }
     
}
}
