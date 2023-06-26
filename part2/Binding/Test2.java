class Car{
	void start(){}
	void accelerate(){}
	void brake(){}
}
class Audi extends Car{
	void start(){
		System.out.println("Audi started");
	}
	void accelerate(){
		System.out.println("Audi acclerated");
	}
	void brake(){
		
		System.out.println("Audi stopped");
	}
}
class Benz extends Car{
	void start(){
		System.out.println("Benz started");
	}
	void accelerate(){
		System.out.println("Benz acclerated");
	}
	void brake(){
		
		System.out.println("Benz stopped");
	}
}
class Driver{
	void drive(Car c){
		c.start();  //late binding
		c.accelerate();  //late binding
		c.brake();  //late binding
	}
}
class Test2{
	public static void main(String args[]){
		Driver d= new Driver();
		d.drive(new Benz());
		d.drive(new Audi());
	}
}