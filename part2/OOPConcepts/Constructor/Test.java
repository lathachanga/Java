class Employee{
	int eId;
	String eName;
	Employee(int id, String name){
		this.eId=id;
		this.eName=name;
	}
}
class Test{
    public static void main(String args[]){
	   Employee e1=new Employee(101,"Srilatha");
	   System.out.println(e1);
	   System.out.println(e1.eId);
	   System.out.println(e1.eName);
	    
	   Employee e2=new Employee(102,"Pavan");
	   System.out.println(e2);
	   System.out.println(e2.eId);
	   System.out.println(e2.eName);
	   
    }
}