class Phone{
	public void  call(long pn){
		System.out.println("call connected using 3g network");
	}
}
class SmartPhone extends Phone{
	public void  call(long pn){
		System.out.println("call connected using 5g network");
	}
}
class Test{
	public static void main(String args[]){
		SmartPhone sp=new SmartPhone();
		sp.call(9490287);
	}
}