class Reverse{
	public static void main(String args[]){
		int num=4562;
		int rev=0;
		int rem;
		System.out.println(num);
		while(num!=0){
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println(rev);
	}
}