class Employee{
	int eId;
	String eName;
	Employee(int id,String name){
		this.eId=id;
		this.eName=name;
	}
	public String toString(){
		return "Employee Name:"+this.eName+"-"+"Emp Id:"+this.eId;
	}
	public static void main(String args[]){
		Employee e=new Employee(101,"Srilatha");
		System.out.println(e);
		System.out.println(e.toString());
	}
}