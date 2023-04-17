class Fibonacci{
	public static void main(String args[]){
		int n1=0;
		int n2=1;
		int temp;
		int num=8;
		
		for(int i=0;i<num;i++){
			System.out.println(n1);
			temp=n1+n2;
			n1=n2;
			n2=temp;
		}
	}
}