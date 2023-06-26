class Book{
	String title;
	String author;
	Book(String t){
		title=t;
	}
	Book(String t,String a){
		this(t);
		author=a;
	}
}
public class Test3{
	public static void main(String args[]){
		Book b=new Book("java","james");
		System.out.println(b.title);
		System.out.println(b.author);
	}
}