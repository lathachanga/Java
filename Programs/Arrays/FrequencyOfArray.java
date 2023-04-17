public class FrequencyOfArray {
    public static void main(String args[]) {
     int a[]={1,2,3,2,4,5,5,3,6,7,2,1,7};
     int freq[]=new int[a.length];
     int visit=-1;
     for(int i=0;i<a.length;i++){
         int count=1;
         for(int j=i+1;j<a.length;j++){
             if(a[i]==a[j]){
                 count++;
                 freq[j]=visit;
             }
         }
         if(freq[i]!=visit){
             freq[i]=count;
         }
     }
     for(int i=0;i<freq.length;i++){
         if(freq[i]!=visit){
             System.out.println("Frequency of "+a[i]+" is:"+freq[i]);
         }
     }
    }
}