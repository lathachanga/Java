package LambdaEx1;
interface CheckInterface{
	public abstract boolean test(int n);
}
public class Test1 implements CheckInterface {
    public boolean test(int n) {
    	return n<1000;
    }
	public static void main(String[] args) {
		Test1 t =new Test1();
	System.out.println(t.test(999));

	}

}
