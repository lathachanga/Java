class PrimeNumber{
	public static void main(String args[]){
		System.out.println(m1(30,2));
	}
	static  boolean m1(int n,int i){
		boolean isprime=false;
		if(n<2){
			return isprime;
		}
		else if(i>=n/2){
			isprime=true;
			return isprime;
		}
		else{
			return m1(n,i+1);
		}
	}
}