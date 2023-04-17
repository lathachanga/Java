class Prime{
	public static void main(String args[]){
		int i=5;
		if(isPrime(i)){
			System.out.println("Prime");
		}
		else{
			System.out.println("not Prime");
		}
		
	}
	static boolean isPrime(int n){
		if(n<2){
			return false;
		}
		for(int i=2;i<=n/2;i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}
}