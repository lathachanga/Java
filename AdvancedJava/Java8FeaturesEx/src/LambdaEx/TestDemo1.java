package LambdaEx;
@FunctionalInterface
interface CalcI1{
	void add(int a,int b);
}
public class TestDemo1 {

	public static void main(String[] args) {
		CalcI1 i=(int a,int b)->{System.out.println(a+b);};
		i.add(10,50);
	}

}
