package LambdaEx;
interface Inter{
	void display();
}
public class Test1 {

	public static void main(String[] args) {
		Inter i=()->{System.out.println("Displaying data");};
         i.display();
	}

}
