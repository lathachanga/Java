package InterfaceEnhancement;
interface EmpDao{
	void m1();
	void m2();
	void m3();
}
class Test1 implements EmpDao{
	public void m1() {
		System.out.println("Test1 class- m1 method");
	}
    public void m2() {
    	System.out.println("Test1 class- m2 method");
	}
    public void m3() {
    	System.out.println("Test1 class- m3 method");
    }
}
class Test2 implements EmpDao{
	public void m1() {
		System.out.println("Test2 class- m1 method");
	}
    public void m2() {
    	System.out.println("Test2 class- m2 method");
	}
    public void m3() {
    	System.out.println("Test2 class- m3 method");
    }
}
public class Test {

	public static void main(String[] args) {
		Test1 t1=new Test1();
           t1.m1();
           t1.m2();
           t1.m3();
        Test1 t2=new Test1();
           t2.m1();
           t2.m2();
           t2.m3();
	}

}
