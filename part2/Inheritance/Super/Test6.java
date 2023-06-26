class A{
	
	A(int i){
		System.out.println("parameterizied construtor in A");
	}
}
class B extends A{
	
	B() {
		super(110);
		System.out.println("Default construtor in B");
	}
}

class Test6{
	public static void main(String args[]){
		new B();  
		
	}
}