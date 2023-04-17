class Strong{
	public static void main(String args[]){
		int num=145;
		int temp=num;
		int sum=0;
		int rem;
		while(num>0){
			rem=num%10;
			int fact=1;
			for(int i=1;i<=rem;i++){
				fact=fact*i;
				
			}
			sum=sum+fact;
			num=num/10;
			
		}
		if(sum==temp){
			System.out.println("Strong number");
		}
		else{
			System.out.println(" not a Strong number");
		}
	}
}