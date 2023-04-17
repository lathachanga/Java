package LambdaEx1;


import java.util.function.Predicate;


public class TestPredicate {
  static  Predicate<Integer> p=(n)->{return n<1000;};
	public static void main(String[] args) {
		System.out.println(p.test(888));
	}

}
