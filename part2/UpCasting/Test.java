class G{
	int i=1;
	void m1(){
		System.out.println("m1() in class G");
	}
}
class H extends G{
	int i=2;
	void m1(){
		System.out.println("m1() in class H");
	}
}
class Test{
	public static void main(String args[]){
		G g1=new G();
	    System.out.println(g1.i);
		g1.m1();
		
		g1=new H();
		System.out.println(g1.i);
		g1.m1();
	}
}