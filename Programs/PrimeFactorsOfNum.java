class PrimeFactors{
	public static void main(String args[]){
		int i= 315;
		primeFactor(i);
	}
	public static void primeFactor(int n){
		int c=2;
		while(n>1){
			if(n%c==0){
			System.out.println(c);
			n=n/c;
			
		}
		else{
			c++;
		}
		}
		
	}
}