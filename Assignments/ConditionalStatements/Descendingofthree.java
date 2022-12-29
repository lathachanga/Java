class Descending{
	public static void main(String args[]){
		int a=99;
		int b=56;
		int c=94;
		if(a>b&&a>c){
			if(b>c){
				System.out.println(a+","+b+","+c);
			}
			else{
				System.out.println(a+","+c+","+b);
			}
		}
		else if(b>a&&b>c){
			if(a>c){
				System.out.println(b+","+a+","+c);
			}
			else{
				System.out.println(b+","+c+","+a);
			}
		}
		else if(c>a&&c>b){
			if(a>b){
				System.out.println(c+","+a+","+b);
			}
			else{
				System.out.println(c+","+b+","+a);
			}
		}
	}
}