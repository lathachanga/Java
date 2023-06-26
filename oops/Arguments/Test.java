class Test{
	static void m1(int ...a){
		System.out.println("m1 Executing");
	}
	public static void main(String args[]){
		m1(3);
		m1(3,2);
		m1(3,2,4,6,9);
	}
}