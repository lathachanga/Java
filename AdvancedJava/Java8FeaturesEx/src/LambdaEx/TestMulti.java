package LambdaEx;
interface CalMulti{
	int multi(int a,int b);
}
public class TestMulti implements CalMulti {
    public int multi(int a,int b) {
    	return a*b;
    }
	public static void main(String[] args) {
		CalMulti obj=new TestMulti();
	System.out.println(	obj.multi(20,40));
          
	}

}
