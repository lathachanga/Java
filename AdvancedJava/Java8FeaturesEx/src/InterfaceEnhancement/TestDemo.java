package InterfaceEnhancement;
interface TestInterface{
	void m1();
	void m2();
	public default void m3() {
		System.out.println("Default method");
	}
}
class TestD implements TestInterface{
	public void m1() {
		System.out.println("Test1 class m1 method");
	}
    public void m2() {
    	System.out.println("Test1 class m2 method");
	}
    public void m3() {
    	System.out.println("Test1 default class m3 method");
	}

}
public class TestDemo {

	public static void main(String[] args) {
		 TestD t =new TestD();
		 t.m1();
		 t.m2();
		 t.m3();
		 

	}

}
