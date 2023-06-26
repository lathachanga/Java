class A{
	static void m1(){
		System.out.println("m1 in class A");
	}
}
class B extends A{
	static void m1(){
		System.out.println("m1 in class B");
	}
}
class Test1{
	
	public static void main(String args[]){
		A.m1();
		B.m1();
		A a;
		a=new A();
		a.m1();  //early binding
		
		a=new B();
		a.m1();  //early binding
	}
}