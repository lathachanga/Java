class Animal{
	 void  move(){
		System.out.println("Running");
	}
}
class Snake extends Animal{
	@Override
    void  move(){
		System.out.println("rawling");
	}
}

class Test2{
	public static void main(String args[]){
		Snake sp=new Snake();
		sp.move();
		
		
		
	}
}