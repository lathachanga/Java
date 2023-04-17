class PerfectSquare{
	public static void main(String args[]){
		int num=36;
		if(perfect(num)){
			System.out.println("Perfect Number");
		}
		else{
			System.out.println(" Not a Perfect Number");
		}
	}
	static boolean perfect(int n){
		for(int i=1;i*i<=n;i++){
			if(n%i==0&&n/i==i){
				return true;
			}
		}
		return false;
	}
}