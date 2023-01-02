class Employee{
	private int eId=101;
	private String eName;
	public void setId(int id){
		this.eId=id;
	}
	public int getId(){
		return eId;
	}
	public void setName(String name){
		this.eName=name;
	}
	public String getName(){
		return eName;
	}
}
public class Test1{
	public static void main(String args[]){
		Employee e1=new Employee();
		e1.setId(105);
		e1.setName("Srilatha");
		System.out.println(e1.getId());
		System.out.println(e1.getName());
		
		Employee e2=new Employee();
		e2.setId(109);
		e2.setName("Bujji");
		System.out.println(e2.getId());
		System.out.println(e2.getName());
	}
}