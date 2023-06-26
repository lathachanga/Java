import java.util.Scanner;
public class HappyNumber {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number");
      int num=sc.nextInt();
      int n=num;
      int sum=0;
      while(num>0){
          sum=0;
          while(num>0){
              int rem=num%10;
              rem=rem*rem;
              sum=sum+rem;
              num=num/10;
          }
          if( sum<=9){
             break;
              
          }
          num=sum;
      }
      if(sum==1){
          System.out.println("Happy number");
      }
      else{
           System.out.println(" Not a Happy number");
      }
    }
}