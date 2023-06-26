class varArgs2{
	static int m1(int ...a){
		int sum=0;
          for(int i=0;i<a.length;i++){
			  sum=sum+a[i];
			  //System.out.println(a[i]);
		  }
		  return sum;
		
	}
	public static void main(String args[]){
		System.out.println(m1(3));
		System.out.println(m1(3,2));
		System.out.println(m1(3,2,4,6,9));
	}
}