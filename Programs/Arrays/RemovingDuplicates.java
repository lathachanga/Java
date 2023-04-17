import java.util.Arrays;

public class RemovingDuplicates
{
  
    public static void main(String []args) 
    { 
         int arr[] = new int[]{10, 30, 40, 20, 10, 20, 50, 10}; 
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                }
            }
        }
        for(int i=0;i<n;i++){
          if(arr[i]!=-1){
            System.out.println(arr[i]);
          }   
        }
       

}
 

 }