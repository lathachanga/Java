class PalidromeString{
	public static void main(String args[]){
		String s="amma";
		String rev="";
		for(int i=0;i<s.length();i++){
			rev=rev+s.charAt(i);
		}
		if(s.equals(rev)){
			System.out.println("String is palidrome");
		}
		else{
			System.out.println("String is Not a palidrome");
		}
	}
}