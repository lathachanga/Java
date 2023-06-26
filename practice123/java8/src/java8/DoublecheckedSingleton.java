package java8;

public class DoublecheckedSingleton {

	private static volatile DoublecheckedSingleton instance=null;
	
	private DoublecheckedSingleton() {
		
	}
	
	public static DoublecheckedSingleton getInstance() {
		if(instance==null) {
			synchronized (DoublecheckedSingleton.class) {
				if(instance==null) {
					instance=new DoublecheckedSingleton();
				}
			}
		}
		return instance;
	}
}
