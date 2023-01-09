class Stud{
	int  rollnum;
	String name;
	static String college="Pro Stack";
	Stud(int roll,String name){
		this.rollnum=roll;
		this.name=name;
	}
	static void change(){
		college="Aaditya";
	}
	public void display(){
		System.out.println("RollNum:"+rollnum+" "+"Name:"+name+" "+"Institute:"+college);
	}
	
}
class Student{
	public static void main(String args[]){
		Stud.change();
		Stud s1=new Stud(103,"Srilatha");
		s1.display();
		
	}
}