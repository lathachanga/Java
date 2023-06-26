public class Test3{
    public static void main(String args[]) {
      int i=0;
	  int j=0;
	  j=m1(++i)+m1(i++);
	   System.out.println("i="+i); //i=2;
	    System.out.println("j="+j);  //j=2;
   
	}
    static int m1(int a){
      
        int y=a;
		return y;
    }
}