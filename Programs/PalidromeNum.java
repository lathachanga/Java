class Palidrome{
	public static void main(String args[]){
		int num=12321;
		int rem;
		int sum=0;
		int temp=num;
		while(temp!=0){
			rem=temp%10;
			sum=sum*10+rem;
			temp=temp/10;
		}
		if(sum==num){
			System.out.println("Palidrome");
		}
		else{
			System.out.println("Not a Palidrome");
		}
	}
}