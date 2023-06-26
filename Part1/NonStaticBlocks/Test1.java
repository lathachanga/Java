class Test1{
	static {
		System.out.println("static block 1 of class");
	}
	
	{
		System.out.println(" non static block of class");
	}
	
	
	Test1(){
		System.out.println(" default constructor class");
	}
	public static void main(String args[]){
		new Test1();
		new Test1();
		new Test1();
		
	}
}