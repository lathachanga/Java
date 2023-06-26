class A{
	
}
class B{
	
}
class C{
	void m1(A arg){
		System.out.println("m1(A) in class C");
	}
	void m1(B arg){
		System.out.println("m1(B) in class C");
	}
}
class D{
	void m1(A arg){
		System.out.println("m1(A) in class D");
	}
	void m1(B arg){
		System.out.println("m1(B) in class D");
	}
}
class Test3{
	public static void main(String args[]){
		C c1=new C();
		A a1=new A();
		c1.m1(a1);
	}
}