//wap to print the given 3 numbers in ascending order
class Ascending{
	public static void main(String args[]){
		int a=85;
		int b=34;
		int c=65;
		if(a<b&&a<c){
			if(b<c){
				System.out.println(a+","+b+","+c);
			}
			else{
				System.out.println(a+","+c+","+b);
			}
		}
		else if(b<a&&b<c)
		{
			if(a<c){
				System.out.println(b+","+a+","+c);
			}
			else{
				System.out.println(b+","+c+","+a);
			}
		}
		else if(c<a&&c<b)
		{
			if(a<b){
				 System.out.println(c+","+a+","+b);
			}
			else{
			    System.out.println(c+","+b+","+a);
			}
			
		}
		
	}
}