package LambdaEx;
@FunctionalInterface
interface InterF{
	public abstract void m1();		
	
}
public class Test implements InterF {
     public void m1() {
    	 System.out.println("Displaying data");
     }
	public static void main(String[] args) {
	InterF	t =new Test();
	t.m1();

	}

}
