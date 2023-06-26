class A{
	int i=1;
}
class B extends A{
	int i=2;
	void m1(){
		int i=3;
		System.out.println(i);
		System.out.println(this.i);
		System.out.println(super.i);
	}
}
class Test4{
	public static void main(String args[]){
		B b=new B();
		b.m1();
	}
}