 class Car {
     
     String color;
     int regNum;
     
      private  static int n=1000;
     Car(String c){
        color=c;
        regNum=n;
        n++;
     }
     void display(){
         System.out.println("regNum="+regNum+"\t color="+color);
     }
}
public class Test{
    
     public static void main(String args[]) {
         
         Car s=new Car("green");
          Car s1=new Car("red");
           Car s2=new Car("black");

    s.display();
      s1.display();
        s2.display();
    }
}

