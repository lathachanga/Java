class RemovingVowelsFromString{
	public static void main(String args[]){
		String s="Srilatha";
		String s1="";
		s1=s.replaceAll("[aeiou]","");
		System.out.println("String after Removing vowel:"+s1);
	}
}