import java.util.Scanner;
public class Test1 {
    public static void main(String args[]) {
     System.out.println("Enter  a num");
     int n=new Scanner(System.in).nextInt();
     System.out.println("n= "+n);
	 new D().m1();
    }
}
class D{
    void m1(){
        System.out.println("m1() executed");
    }
}