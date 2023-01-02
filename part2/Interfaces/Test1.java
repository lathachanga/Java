interface TestInterface{
	int x=200; //by default it is public static final
}
class Test1 implements TestInterface{
	public static void main(String args[]){
		System.out.println(x);
		System.out.println(Test1.x);
		Test1 a=new Test1();
		System.out.println(a.x);
		
	}
}