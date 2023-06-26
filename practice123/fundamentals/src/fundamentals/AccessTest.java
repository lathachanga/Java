package fundamentals;

 class Test1 {
    protected void foo() {
    	System.out.println("hello");
    };
}
 class Test extends Test1{
	   public  void foo() {};
}
 public class AccessTest{
	 public static void main(String args[]) {
		 Test1 t=new Test();
		 t.foo();
	 }
 }
 

