class Second{
	public static void main(String args[]){
		int[] arr={10,40,30,50,20,60,70,80,40};
		int n=arr.length;
		System.out.println(secondLargest(arr,n));
	}
	static int secondLargest(int a[],int n){
		int min=a[0];
		for(int i=0;i<n;i++){
			if(min>a[i]){
				min=a[i];
			}
		}
		int secMin=Integer.MAX_VALUE;
		for(int i=0;i<n;i++){
			if(a[i]!=min && secMin>a[i]){
				secMin=a[i];
			}
		}
		return secMin;
	}
}