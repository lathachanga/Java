package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIEx4 {

	public static void main(String[] args) {
     Stream s=Stream.of(2,3,4,5,6);
     s.forEach(num->System.out.println(num));     
}
}
