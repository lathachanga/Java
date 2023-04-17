class Reverse{
	
	public static String reverse(String str){
			char ch[]=str.toCharArray();
			String rev=" ";
			for(int i=ch.length-1;i>=0;i--){
				rev+=ch[i];
			}
			return rev;
	}
	public static void main(String args[]){
		System.out.println(Reverse.reverse("Iam srilatha"));
	}
}