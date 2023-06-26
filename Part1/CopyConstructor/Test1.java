import java.util.Scanner;
class Book{
	String author;
	String title;
	double price;
	Book(String t,String a,double p){
		title=t;
		author=a;
		price=p;
	}
	void display(){
		System.out.println("Book [title= "+title+", author= "+author+", price="+price);
	}
}
class BookCreater{
	static Book create(){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Title=");
		String t=sc.nextLine();
		System.out.println("Author=");
		String a=sc.nextLine();
		System.out.println("Price=");
		double d=sc.nextDouble();
		
		return new Book(t,a,d);
	}
}
class Test1{
	public static void main(String args[]){
		Book b1=BookCreater.create();
		b1.display();
		Book b2=BookCreater.create();
		b2.display();
	}
}