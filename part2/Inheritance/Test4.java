class P{
	
	static void m1(){
		System.out.println("m1() in P class");
	}
}
class Q extends P{
	
}
class Test4{
	public static void main(String args[]){
		P.m1();
		Q.m1();
		
		P p=new P();
		p.m1();
		Q q=new Q();
		q.m1();
		
	}
}