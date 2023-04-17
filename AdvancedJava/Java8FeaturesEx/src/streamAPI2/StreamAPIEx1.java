package streamAPI2;

import java.util.ArrayList;
import java.util.List;

public class StreamAPIEx1 {

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
      empList.add(new Employee(110,"Sravya",30000));
      empList.add(new Employee(111,"Joshi",30000));
      
      //print employee names,those are names start with 's'
      for(int i=0;i<empList.size();i++) {
    	  if(true) {
    		  System.out.println(empList.get(i).geteName());
    	  }
      }
	}

}
