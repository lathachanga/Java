class C{
	 void  m1(){
		System.out.println("m1 in c");
	}
}
class D extends C{
	 void  m1(){
		System.out.println("m1 in D");
		super.m1();
	}
}

class Test5{
	public static void main(String args[]){
		D sp=new D();
		sp.m1();
		
		
		
	}
}