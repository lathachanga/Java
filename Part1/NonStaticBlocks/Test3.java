 class Car {
     
     String color;
     int regNum;
     private  static int n=1000;
     {
        regNum=n;
        n++;
     }
	 Car(){
		 color="white";
	 }
	 Car(String c){
		 color=c;
	 }
     void display(){
         System.out.println("regNum="+regNum+"\t color="+color);
     }
}
public class Test3{
    
     public static void main(String args[]) {
         
         Car s=new Car();
          Car s1=new Car("red");
           Car s2=new Car("black");

         s.display();
         s1.display();
         s2.display();
    }
}

