 class Box {
     int heigth;
	 int weight;
	 int length;
	 
     Box(int h,int w,int l){
        heigth=h;
		weight=w;
		length=l;
     }
      Box(Box b){
       heigth=b.heigth;
		weight=b.weight;
		length=b.length;
       
     }
	 void display(){
		 System.out.println("Heigth= "+heigth+"\t width="+weight+"\t length="+length);
	 }
}
public class Test{
    
     public static void main(String args[]) {
         
       Box b1=new Box(3,5,7);
	   b1.display();
	   Box b2=new Box(b1);
	   b2.display();
	   
	   
        
    }
}