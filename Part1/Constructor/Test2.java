 class Box {
     int heigth;
	 int weight;
	 int length;
	  Box(){
        
       
     }
     Box(int h,int w,int l){
        heigth=h;
		weight=w;
		length=l;
     }
      Box(int i){
        this(i,i,i);
       
     }
	 void display(){
		 System.out.println("Heigth= "+heigth+"\t width="+weight+"\t length="+length);
	 }
}
public class Test2{
    
     public static void main(String args[]) {
         
       Box b1=new Box(3,5,7);
	   b1.display();
	   Box b2=new Box(3);
	   b2.display();
	   Box b3=new Box();
	   b3.display();
	   
        
    }
}