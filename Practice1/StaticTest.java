public class StaticTest {
   public static void main(String args[]) {
	   System.out.println(fun());
   }
   static int fun() {
	   static int x=0;
	   return ++x;
	   
   }
}