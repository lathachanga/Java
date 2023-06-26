//to print 1 to 5 numbers using recursion
class Number{
	public static void main(String args[]){
		m1(1);
		
	}
	static void m1(int i){
		System.out.println(i);
	
		if(i==3){
			return;
		}
		//m1(i++);  it will throw satck overflow exception
		m1(i+1);
		System.out.println(i);
	}
}