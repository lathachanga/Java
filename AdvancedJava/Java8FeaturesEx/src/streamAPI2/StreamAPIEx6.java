package streamAPI2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIEx6 {

	public static void main(String[] args) {

     List<Employee> empList =new ArrayList<>();
      empList.add(new Employee(101,"Srilatha",30000));
      empList.add(new Employee(102,"Joshna",30000));
      empList.add(new Employee(103,"Jaya",30000));
      empList.add(new Employee(104,"Mounika",30000));
      empList.add(new Employee(105,"Soumya",30000));
      empList.add(new Employee(106,"Manasa",30000));
      empList.add(new Employee(107,"Sandhya",30000));
      empList.add(new Employee(108,"Usha",30000));
      empList.add(new Employee(109,"Srilatha",30000));
      empList.add(new Employee(110,"Sravani",30000));
      empList.add(new Employee(111,"Joshi",30000));
      
      //print employee names,and transform into upperCase
      
     List<String> enames=new ArrayList<>();
     for(int i=0;i<empList.size();i++) {
    	 enames.add(empList.get(i).geteName().toUpperCase());
     }
     System.out.println(enames);
   	}
	
  }


