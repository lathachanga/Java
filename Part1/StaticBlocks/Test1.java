class A{
	static {
		System.out.println("static block of class");
	}
	static void m1(){
		System.out.println("m1()");
	}
}
class Test1{
	static{
		System.out.println("static block of Test1 class");
	}
	public static void main(String args[]){
		System.out.println("main starts");
		A.m1();
		A.m1();
		System.out.println("main ends");
	}
}