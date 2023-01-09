//example, we are going to copy the values of one object into another using Java constructor
class Student{
	int id;
	String name;
	Student(int id,String name){
		this.id=id;
		this.name=name;
	}
	Student(){
		
	}
	public void display(){
		System.out.println("Id:"+id+" "+"Name:"+name);
	}
	
}
class Test{
	public static void main(String args[]){
		Student s1= new Student(101,"Bujji");
		Student s2= new Student();
		s2.id=s1.id;
		s2.name=s1.name;
		s1.display();
		s2.display();
	}
}