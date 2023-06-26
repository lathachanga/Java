class A{
	int i;
}
class B extends A{
	int j;
}
class Test1{
	public static void main(String args[]){
		B b=new B();
		b.i=10;
		b.j=20;
		System.out.println(b.i);
		System.out.println(b.j);
	}
}