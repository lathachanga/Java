class AscenDecen{
	public static void main(String args[]){
		int[] a={2,4,5,1,9,6,8,3};
		int n=a.length;
		int temp;
		System.out.println("Input:");
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
		for(int i=0;i<n-1;i++){
			for(int j=0;j<n/2;j++){
				if(a[j]>a[j+1]){
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			for(int j=n/2;j<n-1;j++){
				if(a[j]<a[j+1]){
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println(" ");
		System.out.println("Output:");
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
	}
}