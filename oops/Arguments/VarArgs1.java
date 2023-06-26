class varArgs{
	static void m1(int ...a){
          for(int i=0;i<a.length;i++){
			  System.out.println(a[i]);
		  }
		  System.out.println();
		
	}
	public static void main(String args[]){
		m1(3);
		m1(3,2);
		m1(3,2,4,6,9);
	}
}