class Car{
	final void deployAirbags(){
		System.out.println("airbags deployed");
	}
}                                 //compile time error
class BMW extends Car{
	final void deployAirbags(){
		System.out.println("airbags deploy");
	}
}