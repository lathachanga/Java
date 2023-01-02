class Reverse{
	public static void rev(int a[] ,int n ){
		int b[]=new int[n];
		int j=n;
		for(int i=0;i<n;i++){
			b[j-1]=a[i];
			j=j-1;
		}
		System.out.println("Reversing array:");
		for(int k=0;k<n;k++){
			System.out.println(b[k]);
		}
	}
	public static void main(String args[]){
		int a[]={10,20,30,40,50};
		rev(a,a.length);
	}
}