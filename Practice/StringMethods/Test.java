class Test{
	public static void main(String args[]){
		String s="Srilatha";
		System.out.println(s.toUpperCase()); //to convert loweercase to uppercase
	    System.out.println(s.toLowerCase()); //to convert uppercase to lowercase
		String s1="  Srilatha  ";
        System.out.println(s1.trim());     //to remove spaces at starting and ending
	    System.out.println(s.startsWith("S"));   // to find a letter starting with a string
	    System.out.println(s.endsWith("a"));   //to find a letter ending with a string
	    System.out.println(s.charAt(4));      // to find the character at given position 
	    System.out.println(s.length());      // to find the length of the length
		String s2=s.intern();     /*A pool of strings, initially empty, is maintained privately by the class String.
When the intern method is invoked, if the pool already contains a String equal to this String object as determined by the equals(Object) method, then the String from the pool is returned. Otherwise, this String object is added to the pool and a reference to this String object is returned.*/
		System.out.println(s2);
		int a=10;
		String s3=String.valueOf(a);
		System.out.println(s3);
		String s5="Java is a programming language. Java is a platform. Java is an Island.";   
		String s4=s5.replace("Java","kava");
		System.out.println(s4);
	}
}