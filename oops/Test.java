public class Test {
    public static void main(String args[]) {
      m1();
      int i=m1();
       System.out.println("i: "+i);
      int j=m1()+3;
      System.out.println("j: "+j);
       System.out.println(m1());
    }
    static int m1(){
        System.out.println("executing m1()");
        return 2;
    }
}/*executing m1()
executing m1()
i: 2
executing m1()
j: 5
executing m1()
2
   
*/