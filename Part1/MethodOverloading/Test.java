class Test{
	public static void main(String args[]){
		System.out.println("main(String args[])");
		main();
		main(5);
	}
	public static void main(){
		
		System.out.println("main()");
	}
	public static void main(int i){
		
		System.out.println("main(int): "+i);
	}
	
	
}