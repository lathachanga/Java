package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StudentExample {

	public static void main(String args[]) {
		
		List<Student> list=new ArrayList<>();
		list.add(new Student(1,"srilatha",35000));
		list.add(new Student(2,"pavan",35000));
		list.add(new Student(3,"bujji",35000));
		list.add(new Student(4,"sandhya",35000));
		list.add(new Student(5,"joshna",35000));
		list.add(new Student(6,"usha",35000));
		list.add(new Student(7,"manasa",35000));
		
		
		long l=list.stream().count();
		System.out.println(l);
		
		//displaying 3rd highest salary
		Optional<Integer> l1=list.stream().map(i->i.getSalary()).sorted(Comparator.reverseOrder())
		.skip(2).findFirst();
		
		System.out.println(l1.get());
	}
}
