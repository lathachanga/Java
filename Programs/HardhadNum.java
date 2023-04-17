class Harshad{
	public static void main(String args[]){
		int num=18;
		int sum=0;
		int rem;
		int temp=num;
		while(num!=0){
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		if(temp%sum==0){
			System.out.println("Harshad Number");
		}
		else{
			System.out.println(" not a Harshad Number");
		}
	}
}