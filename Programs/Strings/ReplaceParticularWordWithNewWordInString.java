class ReplaceParticularWordWithNewWordInString{
	public static void main(String args[]){
		String s1="Srilatha is a Very Good Girl";
		String word="Very";
		s1=s1.replaceAll("Very","");
		s1=s1.trim();
		System.out.print(s1);
	}
}