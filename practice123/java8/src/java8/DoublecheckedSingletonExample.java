package java8;

public class DoublecheckedSingletonExample {

	public static void main(String[] args) {
		DoublecheckedSingleton s1=DoublecheckedSingleton.getInstance();
		DoublecheckedSingleton s2=DoublecheckedSingleton.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);

	}

}
