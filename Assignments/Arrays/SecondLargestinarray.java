class Second{
	static int large(int a[],int n){
		int temp;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(a[i]>a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		return a[n-2];
	}
	public static void main(String args[]){
		int a[]={1,3,5,7,9,4};
		System.out.println("second largest:"+large(a,6));
	}
}