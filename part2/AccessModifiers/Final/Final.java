 final class Parent{
	final int price=499;
	public final void m1(){
		System.out.println("parent class m1 method");
	}
}
class Child extends Parent{
	public final void m1(){
		System.out.println("child class m1 method");
	}
}
class Final{
	public static void main(String args[]){
		Child c =new Child();
		c.m1();
	}
 }