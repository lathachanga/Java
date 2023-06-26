 class Human{
	String name;
	Human(String n){
		name=n;
	}
}
class Teacher extends Human{
	String sub;
	Teacher(String n,String s) {
		super(n);
		sub=s;
	}
}

class Test7{
	public static void main(String args[]){
		Teacher t=new Teacher("Java","c++");  
		System.out.println(t.name);
		System.out.println(t.sub);
	}
}