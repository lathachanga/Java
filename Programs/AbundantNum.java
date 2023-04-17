class AbundantNum{
	public static void main(String args[]){
		int n=18;
		int sum=0;
		for(int i=1;i<n;i++){if(n%i==0) sum=sum+i;}if(sum>n){
			System.out.println("Abundant number");
			System.out.println ("The Abundance is: " + (sum - n));
		}
		else{
			System.out.println("not an Abundant number");
		}
			
		
	}
}