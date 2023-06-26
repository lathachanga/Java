class P{
	
	static {
		System.out.println("static block in p");
	}
}
class Q extends P{
	static {
		System.out.println("static block in Q");
	}
}
class Test5{
	public static void main(String args[]){
		new Q();  //static block in p
		            //static block in Q
		
	}
}