class FriendlyPair{
	public static void main(String args[]){
		int n1=6;
		int n2=28;
		int sum1=isFriendlyPair(n1);
		int sum2=isFriendlyPair(n2);
		if(sum1/n1==sum2/n2){
			   System.out.println (num1 + " & " + num2 + " are friendly pairs");
		}
       else
         System.out.println (num1 + " & " + num2 + " are not friendly pairs");
		}
	}
	static int isFriendlyPair(int n){
		int sum=0;
		for(int i=1;i<n;i++){
			if(n%i==0){
				sum=sum+i;
			}
			return sum;
		}
		
	}
	
}