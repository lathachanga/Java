package LambdaEx;
interface CalMulti1{
	int multiple(int a,int b);
		
	
}
public class TestMulti1 {
public static void main(String[] args) {
	//	CalMulti1 ob=(int a,int b)->{return a*b;};
		CalMulti1 ob=( a, b)->a*b;
		
		//ob.multiple(30,50);
		
			System.out.println(ob.multiple(50,60));
		

	}

}
