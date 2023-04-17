import java.io.FileNotFoundException;  
import java.io.PrintWriter; 
class Test{
	public static void main(String args[]){
		PrintWriter pw;
		try{
			pw=new PrintWriter("jpt.txt");
			pw.println("Saved");
			//int data=100/0;
			
		}
		catch(FileNotFoundException e){
			System.out.println(e);
			
		}
		System.out.println("File saved successfully ");
		
	}
}