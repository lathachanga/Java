class Test{
	public void m1(){
		System.out.println("Zero parameter");
	}
	public void m1(int a){
		System.out.println("one parameter");
	}
	public void m1(int b,float c ){
		System.out.println("Two parameters");
	}
	public void m1(double d){
		System.out.println("double");
	}
	public static void main(String args[]){
		Test t1=new Test();
		t1.m1();
		t1.m1(10);
		t1.m1(10.00);
		t1.m1(20.0f);
		t1.m1(12,20.0f);
	}
}