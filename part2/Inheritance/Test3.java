class C{
	int i;
	void m1(){
		System.out.println(i);
		System.out.println("m1() in c");
	}
}
class D extends C{
	int j;
	void m2(){
		System.out.println(j);
		System.out.println("m2() in D");
	}
}
class Test3{
	public static void main(String args[]){
		D d=new D();
		d.i=10;
		d.j=20;
		d.m1();
		d.m2();
	}
}