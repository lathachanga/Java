class Test1 {
    protected void foo() {};
}
 class Test extends Test1{
	     void foo() {};
}
 public class AccessTest{
	 public static void main(String args[]) {
		 Test t=new Test();
		 t.foo();
	 }
 }
 