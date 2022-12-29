class Reverse{
	public static void main(String args[]){
		int a=3546;
		int sum=0;
		int rev;
		System.out.println("Original number is:"+a);
		while(a!=0){
			rev=a%10;
			sum=sum*10+rev;
			a=a/10;
		}
		System.out.println("Reverse number is:"+sum);
	}
}