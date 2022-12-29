class Fibonaci{
	public static void main(String args[]){
		int num=17;
		int n1=0;
		int n2=1;
		int nextterm;
		for(int i=1;i<=num;i++){
			System.out.println(n1);
			nextterm=n1+n2;
			n1=n2;
			n2=nextterm;
		}
	}
}