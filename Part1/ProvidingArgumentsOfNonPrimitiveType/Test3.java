class Car{
	String color;
	Car(String c){
		color=c;
	}
}
class Garage{
	void changeColor(Car args){
		args.color="green";
		System.out.println("color changed");
		c=null;
	}
}
class Test3{
	public static void main(String args[]){
		Car c1=new Car("Red");
		System.out.println(c1.color);  //red
		Garage g=new Garage(); 
		g.changeColor(c1);  //color changed
		System.out.println(c1.color);  //green
	}
}