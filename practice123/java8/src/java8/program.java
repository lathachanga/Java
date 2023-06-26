package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class program {
	 
	public static void main(String args[]) {
		
		patient p1=new patient(101,"p1","corona",33000);
		patient p2=new patient(152,"p2","fever",43000);
		patient p3=new patient(403,"p3","corona",34000);
		patient p4=new patient(104,"p4","corona",35000);
		patient p5=new patient(105,"p4","covid",55000);
		
		List<patient> patients=Arrays.asList(p1,p2,p3,p4,p5);
		
		patients.stream().filter(p->p.getDisease().equals("corona")&&p.getId()>152).forEach(System.out::println);
		Double avg=patients.stream().filter(p->p.getDisease().equals("corona"))
		.collect(Collectors.averagingDouble(patient::getAmount));
		System.out.println("Avg :"+avg);
		
	}
	}

	

