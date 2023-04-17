class Automorphic{
	public static void main(String args[]){
		int num=6;
		if(isAutomorphic(num)==1){
			System.out.println("Automorphic");
		}
		else{
			System.out.println(" Not an Automorphic");
		}
		
	}
	static int isAutomorphic(int n){
		int sq=n*n;
		while(n!=0){
			if(n%10!=sq%10){
				return 0;
			}
			n=n/10;
			sq=sq/10;
		}
		return 1;
	}
}