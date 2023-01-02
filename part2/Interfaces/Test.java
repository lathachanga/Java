interface TestDoa{
	public abstract void insertRecord(); //by default it is public abstract
	public abstract void setData();
}
class DoaImpl implements TestDoa{
	public void insertRecord(){
		System.out.println("Data Inserted successfully");
	}
	public void setData(){
		System.out.println(" setting Data ");
	}
}
public class Test{
	public static void main(String args[]){
		DoaImpl a =new DoaImpl();
		a.insertRecord();
		a.setData();
		
	}
}