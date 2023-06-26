class A{
	public void  m1(){
		System.out.println("m1 in A");
	}
}
class B extends A{
    public void  m1(){
		System.out.println("m1 in A");
	}
}
class c extends B{
	
}
class Test1{
	public static void main(String args[]){
		B sp=new B();
		sp.call(9490287);
		
		C p=new C();
		p.call(79986666);
		
	}
}