import java.util.Scanner;
public class ArmstrongWithinRange {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter numbers are: ");
      int l=sc.nextInt();
      int h=sc.nextInt();
     
      for(int i=l;i<=h;i++){
		  int temp=i;
          int count=0;
          while(temp>0){
              count++;
              temp=temp/10;
          }
          int rem;
          int sum=0;
           temp=i;
          while(temp>0){
               rem=temp%10;
              int prod=1;
              for(int j=1;j<=count;j++){
                  prod=prod*rem;
              }
              sum=sum+prod;
              temp=temp/10;  
                
          }
         if(sum==i){
              System.out.println(sum);
          }
          
      }
      
    }
}