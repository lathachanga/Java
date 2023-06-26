class A{
	int i;
	A(int i){
		this.i=i;
	}
}
class B{
	int i;
	B(int i){
		this.i=i;
	}
	void m1(A args){
		System.out.println(i);
		System.out.println(this.i);
		System.out.println(args.i);
	}
}
class Test2{
	public static void main(String args[]){
		A a=new A(10);
		B b1=new B(20);
		b1.m1(a);
		
	}
}