package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIEx1 {

	public static void main(String[] args) {
        List<String> enames=new ArrayList<>();
        enames.add("Srilatha");
        enames.add("Joshna");
        enames.add("Jaya");
        enames.add("Sowmya");
        enames.add("Mounika");
        enames.add("Manasa");
        enames.add("Srilatha");
        
        enames.stream()
              .filter(name->name.startsWith("S"))
              .forEach(name->System.out.println(name));
        
   List<String> newNames=enames.stream()
		                       .filter(name->name.startsWith("S"))
		                       .collect(Collectors.toList());
   System.out.println(newNames); //[Srilatha, Sowmya, Srilatha]
   
   List<String> reNames=enames.stream()
		                      .filter(name->name.startsWith("S"))
		                      .map(name->name.toUpperCase())
		                      .collect(Collectors.toList());
   System.out.println(reNames); //[SRILATHA, SOWMYA, SRILATHA]
      
   long numberEmp=enames.stream()
		                .filter(name->name.startsWith("S"))
		                .count();
   System.out.println(numberEmp); 
}
}
