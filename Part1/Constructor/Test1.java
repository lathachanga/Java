 class MyClass {
     
     static int count;
     MyClass(){
         count++;
     }
}
public class Test1{
    
     public static void main(String args[]) {
         
         MyClass s=new MyClass();
          MyClass s1=new MyClass();
           MyClass s2=new MyClass();

      System.out.println("number of phones created = " + MyClass.count);
    }
}

