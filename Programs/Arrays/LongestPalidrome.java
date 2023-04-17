import java.util.*;
public class LongestPalidrome {
    public static void main(String args[]) {
      int a[]={223,454,656,323,98789,76567};
      int n=a.length;
      int large=largest( a,n);
      if(large==-1){
          System.out.println("There is no palidrome");
      }
      else{
           System.out.println("There is  palidrome: "+large);
      }
    }
    static int largest(int a[],int n){
        Arrays.sort(a);
        for(int i=n-1;i>=0;i--){
          if(isPalidrome(a[i])){
            return a[i];
          }
        }
       return -1;
       
    }
    static boolean isPalidrome(int a){
        int rev=0; 
        int rem;
        int temp=a;
        while(temp!=0){
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        if(a==rev){
          return true;
        }
        else{
            return false;
        }
      
    }
}