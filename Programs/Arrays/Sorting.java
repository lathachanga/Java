class Sorting{
	public static void main(String args[]){
		int[] a={2,4,5,1,9,6,8,3};
		int n=a.length;
		int temp;
		System.out.println("Input:");
        for(int i=0;i<n;i++){
			System.out.print(a[i]);
		}
		for(int i=0;i<n-1;i++ ){
			for(int j=i+1;j<n;j++){
				if(a[i]>a[j])
				{
				   temp=a[i];
				   a[i]=a[j];
				   a[j]=temp;
			    }
			}
			
		}
		System.out.println(" ");
		System.out.println("Acending Order:");
		for(int i=0;i<n;i++){
			System.out.print(a[i]);
		}
		// decending order
		for(int i=0;i<n-1;i++ ){
			for(int j=i+1;j<n;j++){
				if(a[i]<a[j])
				{
				   temp=a[i];
				   a[i]=a[j];
				   a[j]=temp;
			    }
			}
			
		}
		System.out.println(" ");
		System.out.println("decending Order:");
		for(int i=0;i<n;i++){
			System.out.print(a[i]);
		}
		
	}
}