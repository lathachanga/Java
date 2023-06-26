import java.util.Scanner;
public class PerfectNumWithinRange {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter numbers are: ");
      int l=sc.nextInt();
      int h=sc.nextInt();
     
     for(int i=l;i<=h;i++){
		  int temp=i;
          int sum=0;
          for(int j=1;j<=temp/2;j++){
              if(temp%j==0){
                  sum=sum+j;
              }
                
          }
           if(sum==i){
              System.out.println(sum);
           }
       
      }
	}  
	  
}
	  /*for(int i=l;i<=h;i++){
		  if(perfect(i)){
			  System.out.println(i);
		  }
	  }
      
    }
	static boolean perfect(int n){
		int sum=0;
		for(int i=1;i<=n/2;i++){
			if(n%i==0){
				sum=sum+i;
			}
		}
		if(sum==n){
			return true;
		}
		else{
			return false;
		}
		
	}*/
