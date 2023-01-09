//example, we are going to copy the values of one object into another using Java constructor
class Student{
	int id;
	String name;
	Student(int id,String name){
		this.id=id;
		this.name=name;
	}
	Student(Student t){
		this.id=t.id;
		this.name=t.name;
	}
	public void display(){
		System.out.println("Id:"+id+" "+"Name:"+name);
	}
	
}
class Test{
	public static void main(String args[]){
		Student s= new Student(101,"Srilatha");
		Student s1= new Student(s);
		s.display();
		s1.display();
	}
}