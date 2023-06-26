class A{
	int i;
	A(int i){
		this.i=i;
	}
}
class B{
	
	void m1(A args){
		System.out.println(args.i);
	}
}
class Test{
	public static void main(String args[]){
		A a=new A(10);
		A a1=new A(20);
		B b1=new B();
		b1.m1(a);
		b1.m1(a1);
		b1.m1(new A(30));
	}
}