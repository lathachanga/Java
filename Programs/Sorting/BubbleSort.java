class BubbleSort {
    public static void main(String args[]) {
     int[] arr={23,54,23,56,45,98,76,87,78,133,43,15,64,53};
     int temp;
     System.out.println("Before bubble sort:");
     for(int i=0;i<arr.length;i++){
         System.out.print(arr[i]+" ");
     }
     for(int i=0;i<arr.length;i++){
         for(int j=i+1;j<arr.length;j++){
             if(arr[i]>arr[j]){
                 temp=arr[i];
                 arr[i]=arr[j];
                 arr[j]=temp;
             }
         }
     }
      System.out.println("");
      System.out.println("After bubble sort:");
     for(int i=0;i<arr.length;i++){
         System.out.print(arr[i]+" ");
     }
    }
}