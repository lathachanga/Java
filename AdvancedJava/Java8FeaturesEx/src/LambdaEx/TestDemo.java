package LambdaEx;
interface CalcI{
	void add(int a,int b);
}
public class TestDemo implements CalcI{
    public void add(int a,int b) {
     	System.out.println(a+b);
    }
	public static void main(String[] args) {
	CalcI	obj =new TestDemo();
     obj.add(10,20);
	}

}
