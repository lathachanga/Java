class Largest{
	public static void main(String args[]){
		int a[]={20,40,10,50,80,70,90};
		int n=a.length;
		System.out.println(secondLarge(a,n));
	}
	static int secondLarge(int a[], int n){
		int max=a[0];
		for(int i=0;i<n;i++){
			if(max<a[i]){
				max=a[i];
			}
		}
		int secLar=Integer.MIN_VALUE;
		for(int i=0;i<n;i++){
			if(a[i]!=max&&secLar<a[i]){
				secLar=a[i];
			}
		}
		return secLar;
	}
}