class Employee
{
	private int eId;
	public void setId(int id){
	     this.eId=id;
	}
	public int getId(){
		return eId;
	}
}
public class Test{
	public static void main(String args[]){
		Employee e1=new Employee();
		Employee e2=new Employee();
		System.out.println(e1);
		System.out.println(e2);
	}
}