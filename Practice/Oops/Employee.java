class Emp{
	int id;
	String name;
	public void getDetails(int id,String name){
		this.id=id;
		this.name=name;
	}
	public void display(){
		System.out.println(this.id+""+this.name);
	}
}
class Employee{
	public static void main(String args[]){
		Emp e1=new Emp();
		Emp e2=new Emp();
		e1.getDetails(101,"Srilatha");
		e2.getDetails(102,"Bujji");
		e1.display();
		e2.display();
	}
}
