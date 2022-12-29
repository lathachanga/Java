class Three{
	public static void main(String args[]){
		int a=323;
		int b=999;
		int c=666;
		if(a<b){
			if(a<c){
				System.out.println("A is least number");
			}
			else{
				System.out.println("C is least number");
			}
		}
		else{
			if(b<c){
				System.out.println("b is least number");
			}
			else{
				System.out.println("c is least number");
			}
		}
	}
	
}