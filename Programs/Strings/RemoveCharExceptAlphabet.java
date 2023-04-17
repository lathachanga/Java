class RemoveCharExceptAlphabet{
	public static void main(String args[]){
		String s="$P*r;e..pi, ns'ta^?";
		String s1="";
		s1=s.replaceAll("[^a-zA-Z]","");
		System.out.println(s1);
	}
}