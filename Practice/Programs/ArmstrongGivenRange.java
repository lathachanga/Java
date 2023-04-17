class Armstrong{
	public static void main(String args[]){
		int lower=1;
		int upper=500;
		
		for(int i=lower;i<=upper;i++){
			int rem;
		    int sum=0;
			int check=i;
			while(check!=0){
				rem=check%10;
			    sum=sum+rem*rem*rem;
				check=check/10;
			}
			if(sum==i){
				System.out.println(i+" is ArmStrong number");
			}
			
		}
	}
}