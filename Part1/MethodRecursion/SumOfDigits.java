class SumOfDigits{
	public static void main(String args[]){
		System.out.println(m1(5231));
	}
	static int m1(int n){
		if(n<=9){
			return n;
		}
		return n%10+m1(n/10);
	}
	
}