class A{
	
	A(){
		System.out.println("Default construtor in A");
	}
}
class B extends A{
	B() {
		System.out.println("Default construtor in B");
	}
}
class C extends B{
	C() {
		System.out.println("Default construtor in C");
	}
}
class Test{
	public static void main(String args[]){
		new C();  
		
	}
}