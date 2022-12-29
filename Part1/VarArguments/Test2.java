class Test2{
	public static void add(int... arr){
		System.out.println(arr);
	}
	public static void main(String args[]){
		add();
		add(10);
		add(10,20);
	}
}