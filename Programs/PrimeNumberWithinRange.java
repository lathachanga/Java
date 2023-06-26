import java.util.Scanner;
public class PrimeNumberWithinRange {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number:");
      int l=sc.nextInt();
      int h=sc.nextInt();
     
     
      for(int i=h;i<=l;i++){
         if(prime(i)){
             System.out.println(i);
             break;
         }
        
      }
     
    }
    static boolean prime(int n){
     if(n<2){
         return false;
     }
     for(int i=2;i<=n/2;i++){
         if(n%i==0){
             return false;
         }
     }
     return true;
        
    }
}