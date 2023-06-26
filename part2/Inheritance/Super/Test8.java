class Shape{
	String color;
	Shape(){
		
	}
	Shape(String n){
		color=n;
	}
}                                                          /// error
class Circle extends Shape{
	int radius;
	Circle(String n,int s) {
		super(n);
		radius=s;
	}
}

class Test8{
	public static void main(String args[]){
		Circle t=new Circle(10,"red");  
		System.out.println(t.color+""+t.radius);
		Circle t1=new Circle("red",10);  
		System.out.println(t1.color+""+t1.radius);
	}
}