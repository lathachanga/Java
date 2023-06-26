class D{
	int i;
	D(int i){
		this.i=i;
	}
	void m1( D args){
		System.out.println(i);
		System.out.println(this.i);
		System.out.println(args.i);
	}
}
class Test4{
	public static void main(String args[]){
		
		D d1 =new D(10);
		D d2 =new D(20);
		d1.m1(d2);
		System.out.println("-----------");
		d2.m1(d1);
		System.out.println("-----------");
		d1.m1(d1);
		System.out.println("-----------");
		d1.m1(new D(30));
		System.out.println("-----------");
		
		new D(40).m1(d2);
	}
}