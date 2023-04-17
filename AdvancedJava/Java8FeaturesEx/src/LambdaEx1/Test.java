package LambdaEx1;
interface CalcInterface{
	public abstract int square(int n);
}
public class Test implements CalcInterface{
    public int square(int n) {
    	return n*n;
    }
	public static void main(String[] args) {
		Test t=new Test();
		System.out.println(t.square(5));
	}

}
