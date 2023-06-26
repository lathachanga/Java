package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class GreaterThanAgePrintNames {

	public static void main(String args[]) {
		List<Employee> l=new ArrayList<>();
		
		l.add(new Employee(101,"srilatha",25,30000));
		l.add(new Employee(102,"bujji",21,30000));
		l.add(new Employee(103,"pavan",19,30000));
		l.add(new Employee(104,"sandhya",23,30000));
		l.add(new Employee(105,"manasa",12,30000));
		l.add(new Employee(106,"usha",22,30000));
		
		
	//print the name of the employee whose age  is greater than 20
	List<String> li=	l.stream().filter(i->i.getAge()>20)
		          .map(Employee::getName)
		          .collect(Collectors.toList());
	
	System.out.println(li);
	
	l.stream().filter(i->i.getAge()>20)
    .map(Employee::getName).forEach(System.out::println);
	
	
   //counting number of employees whose age is 25
	 long list=l.stream().filter(i->i.getAge()==25).count();
	 System.out.println(list);
	 
	 
	 //find the list of an employee whose name is equal to srilatha
	 List<Employee> name=	l.stream().filter(i->i.getName().equals("srilatha")) .collect(Collectors.toList());
  System.out.println(name);
  
  Optional<Employee> n=	l.stream().filter(i->i.getName().equalsIgnoreCase("srilatha")).findAny();
  if(n.isPresent()) {
	  System.out.println(n.get());
	  
	  
	  //find the maximum age of an employee in a list
	  OptionalInt mx=l.stream().mapToInt(Employee::getAge).max();
	  if(mx.isPresent()) {
		  System.out.println(mx.getAsInt());
		  
		  
	//sort all the employee on the basis of age
	l.sort((e1,e2)->e1.getAge()-e2.getAge());
	l.forEach(System.out::println);
	
	
	//given list of employee,group them by employee name
	// l=l.stream().collect(Collectors.groupingBy(Employee::getName));
	
	
	
	
	  }
  }
	}
}
