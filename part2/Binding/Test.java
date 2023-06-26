  class Animal{
	
	void makeSound(){
		System.out.println("make sound in animal");
	}
}
class Dog extends Animal{
	
	void makeSound(){
		System.out.println("Bow Bow");
	}
}
class Cat extends Animal{
	
	void makeSound(){
		System.out.println("meow meow");
	}
}
class Test{
	
	public static void main(String args[]){
		Animal a;
		a=new Dog();
		a.makeSound();   // late binding
		a=new Cat();
		a.makeSound();   // late binding
	}
}