package StaticMethods;
interface Doa{
	public static void m1() {
		System.out.println("Static methods");
	}
}
public class Test {
   public static void main(String args[]) {
	Doa.m1();
}
}
