class Parent{
	public void m1(){
		System.out.println("Parent class m1 method");
	}
}
class Child extends Parent{
	/*public void m1(){
		System.out.println("Child class m1 method");
	}*/
}
class MethodOverriding{
	public static void main(String args[]){
		Parent p= new Parent();
		p.m1();
		Child c =new Child();
		c.m1();
	}
}