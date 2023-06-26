class C{
	void m1(){
		System.out.println("m1() in c");
	}
}
class D extends C{
	void m2(){
		System.out.println("m2() in D");
	}
}
class Test2{
	public static void main(String args[]){
		D d=new D();
		d.m1();
		d.m2();
	}
}