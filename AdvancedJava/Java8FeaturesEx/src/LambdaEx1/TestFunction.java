package LambdaEx1;

import java.util.function.Function;

public class TestFunction {
   static Function<Integer,Integer> f=(n)->{return n*n;};
	public static void main(String[] args) {
		System.out.println(f.apply(6));
		System.out.println(f.apply(5));
	}

}
