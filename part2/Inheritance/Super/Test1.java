class A{
	{
		System.out.println("Non static block in A");
	}
	A(){
		System.out.println("Default construtor in A");
	}
}
class B extends A{
	{
		System.out.println("Non static block in B");
	}
	B() {
		System.out.println("Default construtor in B");
	}
}

class Test1{
	public static void main(String args[]){
		new B();  
		
	}
}