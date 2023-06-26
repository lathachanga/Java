 class MyClass {
     
     MyClass(){
         System.out.println("no arg constructor");
     }
      MyClass(int i){
        this();
        System.out.println("int arg constructor");
     }
}
public class ConstructorUsingThis{
    
     public static void main(String args[]) {
         
         new MyClass(10);
        
    }
}

